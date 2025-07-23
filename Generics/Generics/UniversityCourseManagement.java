package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String title;
    private int credits;

    public CourseType(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated by final exam. Credits: " + getCredits());
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated by assignments. Credits: " + getCredits());
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(getTitle() + " is evaluated by research project. Credits: " + getCredits());
    }
}

class Course<T extends CourseType> {
    private T courseType;
    private String department;

    public Course(T courseType, String department) {
        this.courseType = courseType;
        this.department = department;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getDepartment() {
        return department;
    }

    public void showCourseDetails() {
        System.out.println("Department: " + department);
        courseType.evaluate();
    }
}

class CourseUtils {
    public static void displayAllCourses(List<? extends CourseType> courseTypes) {
        for (CourseType course : courseTypes) {
            course.evaluate();
        }
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics", 4), "Science");
        Course<AssignmentCourse> historyCourse = new Course<>(new AssignmentCourse("World History", 3), "Arts");
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("AI Research", 5), "Engineering");

        mathCourse.showCourseDetails();
        historyCourse.showCourseDetails();
        aiCourse.showCourseDetails();

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Physics", 4));
        allCourses.add(new AssignmentCourse("Philosophy", 2));
        allCourses.add(new ResearchCourse("Quantum Computing", 6));

        System.out.println("\n--- Display All Courses via Wildcard Method ---");
        CourseUtils.displayAllCourses(allCourses);
    }
}

