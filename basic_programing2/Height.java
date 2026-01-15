import java.util.Scanner;
class Height{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your Height in cm:-");
        float Height=input.nextFloat();
       double Height1=Height*eight* 0.393701;
        double Height2=(Height*0.032808);
        System.out.println("your Height in inches-:"+Height1);
        System.out.println("your Height in feet-:"+Height2);
    }
}