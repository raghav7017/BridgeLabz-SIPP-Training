import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI freeze on dashboard")
    public void run() {
        System.out.println("Software running...");
    }
}

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Method m = Software.class.getMethod("run");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}