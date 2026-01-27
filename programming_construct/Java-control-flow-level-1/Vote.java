import java.util.Scanner;
class Vote{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write your age");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        else if(age<18){
            System.out.println("you are not eligible for voting");
        }
    }
}