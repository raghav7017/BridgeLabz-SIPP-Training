import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Processor {
    @LogExecutionTime
    public void heavyTask() {
        for (int i = 0; i < 1_000_000; i++);
    }
}

public class LogExecutionDemo {
    public static void main(String[] args) throws Exception {
        Method m = Processor.class.getMethod("heavyTask");
        if (m.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            m.invoke(new Processor());
            long end = System.nanoTime();
            System.out.println("Execution time: " + (end - start) + " ns");
        }
    }
}