package LambdaExpression;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList(
                "Rahul",
                "Amit",
                "Sneha",
                "Priya"
        );

        List<String> upperNames = employees.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Employee Names in Uppercase:");

        upperNames.forEach(System.out::println);
    }
}
