import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the physics number");
        float p=input.nextFloat();
        System.out.println("enter the chemistry number:");
        float c=input.nextFloat();
        System.out.println("enter the maths number:");
        Float m=input.nextFloat();
        float percentage;
        percentage= ((p+c+m)/300)*100;
        if(p>=100 && m>=100 && c>=100){
       if (percentage>=1 && percentage<=100) {
           
        if (percentage>=80){
            System.out.println("Grade: A ");
            System.out.println("Remark: Level 4,above agency-normalized standards");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("grade: B");
            System.out.println("Remark: Level 3,at agency-normalized standards");
        }
        else if (percentage>=60 && percentage<=69) {
            System.out.println("Grade: C");
            System.out.println("Remark: Level 2 , below but approaching agency normalize standards");
        }
        else if (percentage>=50 && percentage<=59) {
            System.out.println("Grade: D");
            System.out.println("Remark: Level 1 ,well below agency normalized standards");
        }
        else if (percentage>=40 && percentage<=49) {
            System.out.println("Grade: E");    
            System.out.println("Remark: Level -1 , too below agency-normalized standards");
        }
        else if (percentage>=1 && percentage<=39) {
            System.out.println("Grade: R");    
            System.out.println("Remark: Remedial standards");
        } 
        }
        else{
            System.out.println("invalid percentage");
        }
    }
    else {
        System.out.println("enter the marks properly");
    }
    }
}