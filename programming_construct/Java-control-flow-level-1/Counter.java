import java.util.Scanner;
class Counter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();
        while (number>0) { 
            number--;
            if(number!=0){
                System.out.println("counting: "+number);
            }
        }
    }
}