import java.util.Scanner;
class FactorUsingWhile{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a=input.nextInt();
        int i=0;
        if(a>1){
              System.out.println("factor of number");
            
               while(i<a){
                i++;
                if(a%i == 0){
                   
                    System.out.print(" "+i );
                }
            }
        }
         else{
                    System.out.println("please enter positive number ");
                }
    }
    }
    