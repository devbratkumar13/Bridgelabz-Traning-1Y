import java.util.Scanner;
class Abundant{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        int sum=0;
      for (int i = 1; i < num ; i++) {
        if (num%i == 0) {
            sum=sum+i;
        }
          
      }
        System.out.println(sum);
        if (sum>num) {
            System.out.println(+num+"is Abundant number");
        
        } else {
            System.out.println(+num+" is not Abundant number");
        }
    }

}