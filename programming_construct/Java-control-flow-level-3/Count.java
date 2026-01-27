import java.util.Scanner;
class count{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=input.nextInt();
       int count=0;
       if(number==0){
        count=1;
       }
       else if (number<0) {
        System.out.println("enter positive number");
           }
           else{
       while (number!=0){
        number=number/10;
        count++;
       } 
       
        
           }System.out.println(count);
    }
    }