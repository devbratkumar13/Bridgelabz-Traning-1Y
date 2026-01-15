import java.util.Scanner;
class Multiply{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the unit price:-");
        float a=input.nextFloat();
        System.out.println("enter the quantity:-");
        float b=input.nextFloat();
        double c;
        c=a*b;
        System.out.println("the total price:- "+c);
    }
}