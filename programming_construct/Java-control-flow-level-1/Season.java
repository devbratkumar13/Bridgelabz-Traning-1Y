import java.util.Scanner;
class Season{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the date");
        int date=input.nextInt();
        System.out.println("enter the month ");
        int month=input.nextInt();
        if ((month==3 && date>=20) || (month==4) || (month==5) || (month==6 && date<=20)){
            System.out.println("your date and month is spring season");
        }
    }
}
