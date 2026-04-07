package assignment;
import java.util.Scanner;

public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre a Value :-");

            int num = sc.nextInt();
            Integer obj = Integer.valueOf(num);

            System.out.println("Primitive value = " + num);
            System.out.println("Wrapper object value = " + obj);
        }
}
