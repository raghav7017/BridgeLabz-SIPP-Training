package lambdaproblems;

import java.util.*;
import java.util.function.Predicate;

class Notification {
    String message;
    String type;

    Notification(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Notification> notifications = Arrays.asList(
            new Notification("Patient A needs urgent care", "CRITICAL"),
            new Notification("Reminder: Take medicine", "REMINDER"),
            new Notification("New health tips available", "INFO")
        );

        Predicate<Notification> criticalOnly = n -> n.type.equals("CRITICAL");

        System.out.println("Critical Alerts:");
        notifications.stream().filter(criticalOnly).forEach(System.out::println);
    }
}
