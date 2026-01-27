//Write a program FizzBuzz, take a number as user input, and check for a positive integer.
// If positive integer, loop and print the number,
// but for multiples of 3 print "Fizz" instead of the number,
//for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz". Hint => a. 
//Take the user input number, check for a positive integer, and use for loop to display
import java.util.Scanner;
class FizzBuzz{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int a=input.nextInt();
        for (int i=1; i<=a; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.print("\nfizzbuzz");   
            }
            else if (i%5 == 0 ) {
                System.out.print("\nbuzz");
            }
            else  if (i%3 == 0 ) {
                System.out.print("\nfizz");
            }
            else{
                System.out.print("\n"+i);
            }
        }
        
    }
}