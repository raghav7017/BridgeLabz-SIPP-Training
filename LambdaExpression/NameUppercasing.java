package lambdaproblems;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class NameUppercasing {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("rahul"),
            new Employee("sita"),
            new Employee("amit")
        );

        employees.stream()
                 .map(Employee::getName)
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
