import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a numnber:");
        int number=input.nextInt();
        int sum = 0;
        int a=number;
        while (number!=0) {
            int digit=number%10;
            sum= sum+(digit*digit*digit);
            number=number/10;
        }
        if(sum == a){
            System.out.println(+a+" is an armstrong number");
        }
        else{
            System.out.println(+a+" is not an armstrong number");
        }
    }
}