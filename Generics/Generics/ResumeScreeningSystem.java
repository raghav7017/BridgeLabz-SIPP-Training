package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;
    private int yearsOfExperience;

    public JobRole(String candidateName, int yearsOfExperience) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public abstract void evaluateResume();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int yearsOfExperience) {
        super(candidateName, yearsOfExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Software Engineer Resume: " + getCandidateName() +
                " | Experience: " + getYearsOfExperience() + " years | Skills: Java, DSA, Spring");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int yearsOfExperience) {
        super(candidateName, yearsOfExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Data Scientist Resume: " + getCandidateName() +
                " | Experience: " + getYearsOfExperience() + " years | Skills: Python, ML, SQL");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int yearsOfExperience) {
        super(candidateName, yearsOfExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Product Manager Resume: " + getCandidateName() +
                " | Experience: " + getYearsOfExperience() + " years | Skills: Leadership, Agile, Roadmapping");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void screen() {
        jobRole.evaluateResume();
    }
}

class ScreeningUtils {
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing resume for: " + resume.getJobRole().getCandidateName());
        resume.screen();
    }

    public static void bulkScreen(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            role.evaluateResume();
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer("Aman Khan", 3));
        Resume<DataScientist> r2 = new Resume<>(new DataScientist("Riya Sharma", 2));
        Resume<ProductManager> r3 = new Resume<>(new ProductManager("Vikram Mehta", 5));

        ScreeningUtils.processResume(r1);
        ScreeningUtils.processResume(r2);
        ScreeningUtils.processResume(r3);

        List<JobRole> allCandidates = new ArrayList<>();
        allCandidates.add(new SoftwareEngineer("Rahul Verma", 4));
        allCandidates.add(new DataScientist("Neha Sinha", 1));
        allCandidates.add(new ProductManager("Arjun Patel", 6));

        System.out.println("\n--- Bulk Screening ---");
        ScreeningUtils.bulkScreen(allCandidates);
    }
}

