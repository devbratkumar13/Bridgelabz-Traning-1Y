package com.gla.Constructor.Level_2;

import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    void removeItem() {
        quantity = 0;
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CartItem c = new CartItem();
        String name = in.nextLine();
        double price = in.nextDouble();
        int quantity = in.nextInt();
        c.addItem(name, price, quantity);
        c.displayTotalCost();
    }
}
