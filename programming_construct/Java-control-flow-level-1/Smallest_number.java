import java.util.Scanner;
class Smallest_number{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check the smallest number:");
		System.out.println("Enter number1;");
		int number1 =scanner.nextInt();
		System.out.println("Enter number2;");
		int number2 =scanner.nextInt();
		System.out.println("Enter number3;");
		int number3 =scanner.nextInt();
		if(number1<number2&&number1<number3){
			System.out.println("This is smallest Number:-");
		}else{
			System.out.println("This is NOT smallest Number:-");
		}
		
	}
}