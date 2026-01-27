import java.util.Scanner;
class Fact{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your number");
        double a=input.nextDouble();
        double factorial=1;
        int i=1;
     for (i=1; i <= a; i++){
            factorial=factorial*i;    
        }
     System.out.println("factorial is :"+factorial);
    }
}