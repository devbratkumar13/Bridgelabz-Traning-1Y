package com.gla.Constructor.Level_1;
import java.util.Scanner;
class Inventory {
    int itemCode;
    String itemName;
    double price;
    void displayItem(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Inventory i = new Inventory();
        i.itemCode = in.nextInt();
        in.nextLine();
        i.itemName = in.nextLine();
        i.price = in.nextDouble();
        int quantity = in.nextInt();
        i.displayItem(quantity);
    }
}