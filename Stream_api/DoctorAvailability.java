package com.gla.Stream_api;
import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public String toString() {
        return name + " - " + specialty;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Raj", "Cardiology", true),
                new Doctor("Dr. Meena", "Neurology", false),
                new Doctor("Dr. Amit", "Dermatology", true),
                new Doctor("Dr. Sara", "Orthopedics", true)
        );

        doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted((d1, d2) ->
                        d1.specialty.compareTo(d2.specialty))
                .forEach(System.out::println);
    }
}