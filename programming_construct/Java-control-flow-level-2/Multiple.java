import java.util.Scanner;
class  Multiple{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number between 1 to 100");
    int a=input.nextInt();
    System.out.println("multiples of "+a +" are:");
    if (a>1 && a<100) {
        for (int i=100; i>1; i--){
            if(i%a == 0){
                System.out.println(i);
            }           
        }        
    }
    }
}
