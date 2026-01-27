import java.util.Scanner;
class MultipleWhile{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number between 1 to 100");
        int a=input.nextInt();
        int i=100;
        System.out.println("multiple of "+a +" in between 1 to 100");

        if (a>1 && a<100) {
            while (i>a) { 
                i-- ;
              if(i%a == 0){
                System.out.println(i);
              }
            }

            
        }
    }
}