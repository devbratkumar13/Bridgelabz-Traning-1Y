import java.util.Scanner;
class Divisible5{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check the number is divisible by 5:");
		int number=scanner.nextInt();
	    if(number%5==0){
			System.out.println("It is divisible by 5:");
		}
		else{
			System.out.println("It is not divisible by 5:");
		}
	}
}