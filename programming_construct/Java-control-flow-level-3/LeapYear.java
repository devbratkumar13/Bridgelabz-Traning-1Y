import java.util.Scanner;
class LeapYear{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the year after 1582");
        int year=input.nextInt();
        if(year>=1582){
            
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        }
        else{
            System.out.println("please enter year greater or equal then 1582 ");
        }
        
    }
}