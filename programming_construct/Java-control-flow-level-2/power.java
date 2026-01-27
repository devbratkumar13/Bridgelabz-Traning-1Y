import java.util.Scanner;
class power{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        System.out.println("enter the power");
        int x=input.nextInt();
        int y=1;
        for (int i=1; i<=x; i++) {
            y=y*num; 
        }
        System.out.println(+num+" raised to the power "+x+ " is: "+y);   
    }
}