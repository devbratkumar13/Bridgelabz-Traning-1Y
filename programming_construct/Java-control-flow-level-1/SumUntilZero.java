import java.util.Scanner;
class SumUntilZero{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number:");
    Double num=input.nextDouble();
    double total = 0.0;
    while(num!=0){
        total = total+num;
        System.out.println("enter another number , use '0' to stop");
        num=input.nextDouble();
    }
    System.out.println("total sum:"+total);
    }
}