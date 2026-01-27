import java.util.Scanner;
class CheckNum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a number");
        double a=input.nextDouble();
        if(a>=1){
            System.out.println("Your number is positive");
        }
        else if(a==0){
            System.out.println("Your number is zero");
        }
        else if(a<=-1){
            System.out.println("Your number is negative");
        }
    }
}