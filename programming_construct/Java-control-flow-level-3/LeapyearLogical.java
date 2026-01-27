import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check the year is Leap year:");
		int Year=scanner.nextInt();
		if(Year>=1582 && ((Year%400==0) || (Year%4==0 && Year%100!=0)))
		{
			System.out.println("This Is a LeapYear:");
		}
		else if(Year>=1582){
			System.out.println("This Is NOT a LeapYear:");
		}else{
			System.out.println("Invalid Year:");
		}
	}
}