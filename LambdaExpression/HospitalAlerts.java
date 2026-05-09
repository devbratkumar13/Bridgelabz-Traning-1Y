package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + " -> " + message;
    }
}

public class HospitalAlerts {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency", "Heart rate critical"),
                new Alert("Reminder", "Take medicine"),
                new Alert("Emergency", "Blood pressure low"),
                new Alert("Info", "Doctor available")
        );

        Predicate<Alert> emergencyFilter =
                a -> a.type.equals("Emergency");

        System.out.println("Emergency Alerts:");

        alerts.stream()
                .filter(emergencyFilter)
                .forEach(System.out::println);
    }
}