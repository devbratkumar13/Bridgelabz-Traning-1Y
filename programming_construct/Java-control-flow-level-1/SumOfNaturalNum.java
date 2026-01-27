import java.util.Scanner;

public class SumOfNaturalNum{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0)");
        } 
        else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop:  " + sum);
            System.out.println("Sum using formula: " + sumFormula);

            if (sum == sumFormula) {
                System.out.println("Result is same");
            } 
            else{
                System.out.println("Result is not same");
            }
        }

       
    }
}
