import java.lang.reflect.*;

class Student {
    private String name;
    public Student() {
        this.name = "Default Student";
    }
    public void show() {
        System.out.println("Student name: " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");

        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(obj);
    }
}