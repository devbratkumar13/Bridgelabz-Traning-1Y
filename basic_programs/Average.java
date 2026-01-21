import java.util.Scanner;
class Average{
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("enter your first number");
        double a=input.nextDouble();
        System.out.println("enter your second num");
        double b=input.nextDouble();
        System.out.println("enter your third num");
        double c=input.nextDouble();
       double average = (a + b + c)/3 ;
        System.out.println("average:- "+average); 

    }
}