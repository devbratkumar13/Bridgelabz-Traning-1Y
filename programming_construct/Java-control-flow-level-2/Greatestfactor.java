import java.util.Scanner;
class Greatestfactor{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a=input.nextInt();
        int i=1;
        int greatest = 1;
        if(a>1){
              while (i <= a/2)  {
                if (a%i == 0) {
                    greatest=i;
                } 
                i++;
              }
              System.out.println("greatest factor:" +greatest);
        }
         else{
                    System.out.println("please enter positive number ");
                }
    }
    }
    