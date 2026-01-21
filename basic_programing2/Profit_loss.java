import java.util.Scanner;
class Profit_loss{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your cost price:-");
        float cost=input.nextInt();
        System.out.println("Enter the selling price:-");
        float selling_price=input.nextInt();
        float profit;
        profit = selling_price-cost;
        System.out.println("profit on product:- "+profit);
        float profit_percentage;
        profit_percentage=(profit/cost)*100;
     
		System.out.println("percentage on profit:- "+profit_percentage);
}
}