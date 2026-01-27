import java.util.Scanner;
class Countdown{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int a=input.nextInt();
        System.out.println("\ncountdown starts");
        for (int i=a; i>=1; i--) {
           System.out.println(i);            
        }

    }
}