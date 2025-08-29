package lambdaproblems;

import java.util.*;

class Hospital {
    String patientId;

    Hospital(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }
}

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<Hospital> patients = Arrays.asList(
            new Hospital("P101"),
            new Hospital("P102"),
            new Hospital("P103")
        );

        patients.stream()
                .map(Hospital::getPatientId)
                .forEach(System.out::println);
    }
}
