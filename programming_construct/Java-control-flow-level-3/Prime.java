import java.util.Scanner;
class Prime{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a=input.nextInt();
        for (int i = 2; i < a; i++) {
            if (a%i != 0) {
                System.out.println(+a+" is a prime number");
                 }
                 else if (a%i == 0){
                System.out.println(+a+" is a not prime number");
                break;
            }
            }
            
            
        }
    }