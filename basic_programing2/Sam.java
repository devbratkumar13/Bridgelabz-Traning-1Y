import java.util.Scanner;
class Sam{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your maths number:- ");
        int a=input.nextInt();
        System.out.println("enter your physics number:- ");
        int b=input.nextInt();
        System.out.println("enter your chem num.:- ");
        int c=input.nextInt();
        int average;
        average=(a+b+c)/3;
        System.out.println("average:- "+average);
    }
}