import java.util.Scanner;
class Harry{
   public static void main(String args[])
    {
          Scanner input = new Scanner(System.in);
    System.out.println("enter your birth year:-");
    int year =input.nextInt();
    int age = 2026 - year;
    System.out.println("your age:- "+age);
        
    }
}