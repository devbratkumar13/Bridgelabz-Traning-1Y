import java.util.Scanner;
class LargestNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num");
        int a=input.nextInt();
        System.out.println("enter second num");
        int b=input.nextInt();
        System.out.println("enter third num");
        int c=input.nextInt();
        if (a>b && a>c){
            System.out.println("first number is largest");
        }
        else if(b>a && b>c){
            System.out.println("second number is largest");
        }
        else if (c>a && c>b){
            System.out.println("third num is largest");
        }
    }
}