import java.util.Scanner;
class PowerWhile{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a=input.nextInt();
        System.out.println("enter power of number");
        int p=input.nextInt();
        int r=1;
        int i=1;
        while (i<=p) { 
            i++;
        r=r*a;
        }
      System.out.println(+a+" raised to the power "+p+ " is: "+r);  

    }
}