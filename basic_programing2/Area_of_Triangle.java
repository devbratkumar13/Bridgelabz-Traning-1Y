import java.util.Scanner;
class Area_of_Triangle{
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("write base in cm:-");
     float base=input.nextFloat();
     System.out.println("write heigh in cm :-");
     float height=input.nextFloat();
     double area;
     area = (0.5*base*height);
     System.out.println("area in cm square-:"+area);
     double area1 ;
     area1= (area*0.155);
     System.out.println("area in inches square-:"+area1);
    }
}