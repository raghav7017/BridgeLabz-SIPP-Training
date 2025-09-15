import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement login", assignedTo = "Bob", priority = "HIGH")
    public void login() {}

    @Todo(task = "Fix logout bug", assignedTo = "Alice")
    public void logout() {}
}

public class TodoDemo {
    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " -> Task: " + t.task() +
                                   ", Assigned To: " + t.assignedTo() +
                                   ", Priority: " + t.priority());
            }
        }
    }
}