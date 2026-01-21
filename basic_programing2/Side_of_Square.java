import java.util.Scanner;
class Side_of_Square{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the parameter:-");
        float parameter=input.nextFloat();
        float side;
        side=parameter/4;
        System.out.println("The length of the side of the square:- "+side);
    }
}