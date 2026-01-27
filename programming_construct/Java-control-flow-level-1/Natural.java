import java.util.Scanner;
class Natural{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a number");
        double a=input.nextDouble();
        if(a>=0){
            System.out.println("your number is natural");
            double sum;
            sum=a*(a+1)/2;
            System.out.println("sum of natural. number "+sum);
        }
        else if(a<=-1){
            System.out.println("your num is not natural");
        }
    }
}