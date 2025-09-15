import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void deleteData() {
        System.out.println("Data deleted!");
    }
}

public class RoleDemo {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER"; // Change to "ADMIN" to allow

        Method m = SecureService.class.getMethod("deleteData");
        RoleAllowed role = m.getAnnotation(RoleAllowed.class);

        if (role.value().equals(currentUserRole)) {
            m.invoke(new SecureService());
        } else {
            System.out.println("Access Denied!");
        }
    }
}