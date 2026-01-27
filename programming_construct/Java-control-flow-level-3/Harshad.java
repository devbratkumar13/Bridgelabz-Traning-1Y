import java.util.Scanner;
class Harshad{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
       int num=input.nextInt();
       int sum=0;
       int number=num;
        
    if (num>0) {
        
        while (number!=0) { 
           int digit=number%10;
            sum=sum+digit;
            number=number/10;
         }
         System.out.println(sum);   
         if (num%sum == 0 ) {
            System.out.println("your number "+num+"is harshad number.");
             
         }
         else{
            System.out.println("your number is not harshad number");
         }
    }
    else{
        System.out.println("enter a positive number");
    }
    }
}