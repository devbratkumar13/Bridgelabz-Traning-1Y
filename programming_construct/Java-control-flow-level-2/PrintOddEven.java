//Create a program to print odd and even numbers between 1 to the number entered by the user
//Hint =>
//a. Get an integer input from the user, assign to a variable number and check for Natural number.
//b. Using a for loop, iterate from 1 to the number
//c. In each iteration of the loop, print the number is odd or even number
import java.util.Scanner;
class PrintOddEven{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your number ");
        int a=input.nextInt();
        if (a>0){
            System.out.println("your number is natural number\n");
                System.out.print("odd number form 1 to "+a +" are: ");
                for (int i = 1; i <= a; i++) {
                     if(i%2 != 0)
                     {
                    System.err.print(i + " ");
                     }
                }
                System.out.print("\n even number from 1 to "+a +" are: ");
                     for (int i = 1; i <= a; i++) {
                     if (i%2 ==0) {
                        System.out.print(i +" ");
                    }
                    
                }
            }
        }  
    
    }