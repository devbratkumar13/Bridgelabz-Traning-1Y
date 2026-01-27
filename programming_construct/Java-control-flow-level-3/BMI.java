import java.util.Scanner;
class BMI{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the weight in kg:");
        double weight=input.nextDouble();
        System.out.println("enter the height in meter:");
        double height=input.nextDouble();
        double bmi;
        bmi=weight/(height*height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}