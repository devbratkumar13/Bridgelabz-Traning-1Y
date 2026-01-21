import java.util.Scanner;
class Kilometer_To_Miles{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter km:-");
        double Kilometer=input.nextDouble();
        double miles;
        miles = Kilometer*1.6;
        System.out.println("km in miles:- "+miles);
    }
}