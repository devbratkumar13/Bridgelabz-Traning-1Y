import java.util.Scanner;
class Volume_of_earth{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius:-");
        float r=input.nextFloat();
        float V = (4/3)*(22/7)*r*r*r;
        System.out.println("volume of earth in km:- "+V);
        double V1= (0.2399*V) ;
        System.out.println("volume of earth in miles:- "+V1);
	}
}