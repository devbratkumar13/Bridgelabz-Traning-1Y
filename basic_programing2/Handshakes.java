import java.util.Scanner;
class Handshakes{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of students-:");
        int a=input.nextInt();
        int handshakes=(a*(a-1))/2;
        System.out.println("the number of handshakes-:"+handshakes);
    }
}