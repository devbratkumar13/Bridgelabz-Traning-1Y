import java.util.Scanner;
class Student{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("enter the no. of pen-: ");
     int pen = input.nextInt();
     System.out.println("enter the students number:-");
     int students=input.nextInt();
     int Que=pen/students;
     System.out.println("questient:- "+Que);
     float rem=pen%students;
     System.out.println("remainder:- "+rem);
    }
}