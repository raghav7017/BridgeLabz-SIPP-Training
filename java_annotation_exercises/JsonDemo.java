import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class UserJson {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public UserJson(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

public class JsonDemo {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        java.lang.reflect.Field[] fields = obj.getClass().getDeclaredFields();
        for (java.lang.reflect.Field f : fields) {
            if (f.isAnnotationPresent(JsonField.class)) {
                f.setAccessible(true);
                JsonField jf = f.getAnnotation(JsonField.class);
                json.append("\"").append(jf.name()).append("\":\"")
                    .append(f.get(obj)).append("\",");
            }
        }
        if (json.charAt(json.length() - 1) == ',')
            json.deleteCharAt(json.length() - 1);
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        UserJson user = new UserJson("Alice", 25);
        System.out.println(toJson(user));
    }
}