//Write a Program to find the factorial of an integer entered by the user.
//a. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
//b. Take an integer input from the user and assign it to the variable. Check the user has
//entered a positive integer.
//c. Using a while loop, compute the factorial.
//d. Print the factorial at the end.
import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your number");
        double a=input.nextDouble();
        double factorial=1;
        int i=1;
        while(i<=a){
            factorial=factorial*i;
            i++;
            
        }
     System.out.println("factorial is :"+factorial);
    }
}