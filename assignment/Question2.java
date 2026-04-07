package assignment;

public class Question2 {
    public void WrapperToPrimitive(){
        Double num1 = 45.89;
        double num2 = 45.89;
        int num3 = (int)num2;
        System.out.println("Double :-"+num1);
        System.out.println("double :-"+num2);
        System.out.println("int :-"+num3);
    }
    public static void main(String args[]){
      Question2 q2 = new Question2();
      q2.WrapperToPrimitive();
    }
}
