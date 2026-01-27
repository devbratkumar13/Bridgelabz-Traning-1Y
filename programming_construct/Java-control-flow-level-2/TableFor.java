import java.util.Scanner;
class TableFor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
         for (int i=1;i<=10;i++) {
                int a=n*i;
                System.out.println(+n +"*"+i+"="+a);
         }  
    }
}