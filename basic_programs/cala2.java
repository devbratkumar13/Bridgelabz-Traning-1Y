import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num:-");
        double a=input.nextDouble();
         System.out.println("enter the second num:-");
         double b=input.nextDouble();
         double A=a+b;
         double S=a-b;
         double D=a/b;
         double M=a*b;
         System.out.println("Add of two num-:"+A);
          System.out.println("sub of two num-:"+S);
           System.out.println("divide of two num-:"+D);
            System.out.println("multiplication of two num-:"+M);
    }
}