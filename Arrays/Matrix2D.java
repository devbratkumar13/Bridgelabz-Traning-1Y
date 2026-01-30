import java.util.Arrays;
import java.util.Scanner;
class Matrix2D{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Print Matrix:-");
		int arr[][]=new int[3][3];
		for(int i=0;i< row;i++)
		{
			for(int j=0;j< col;i++)
			{
				arr[i][j]=in.nextInt();	
			}
		}
		for(int i=0;i< row;i++)
		{
			for(int j=0;j< col;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
		} System.out.println("");
	}
}