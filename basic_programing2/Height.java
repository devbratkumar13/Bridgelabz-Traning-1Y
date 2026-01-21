import java.util.Scanner;
class Height{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your height in cm:-");
        float height=input.nextFloat();
       double height1=height* 0.393701;
        double height2=(height*0.032808);
        System.out.println("your height in inches-:"+height1);
        System.out.println("your height in feet-:"+height2);

    }
}