import  java.util.Scanner;
class GreatestFor{
    public static void main(String[] args) 
    {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter a positive number:");
           int a=input.nextInt();
           int greatest=1;
           if (a>1) 
            {
            for (int i = 1; i <= a/2; i++) 
            {
                if(a%i == 0)
                {
                    greatest=i;
                }
            } 
            System.out.println("greatest factor of "+a +" is "+greatest);
            }
    }   
        }
