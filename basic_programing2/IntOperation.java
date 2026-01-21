import java.util.Scanner;
class IntOperation{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers a, b, c:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println("a + b * c = " +(a + b * c));  
        System.out.println("a * b + c = " +(a * b + c));  
        System.out.println("c + a / b = " +(c + a / b));  
        System.out.println("a % b + c = " +(a % b + c)); 
    }
}