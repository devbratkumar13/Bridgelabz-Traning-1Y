package com.gla.Constructor_Instances.Level1;

import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        String author = in.nextLine();
        double price = in.nextDouble();
        Book b1 = new Book();
        Book b2 = new Book(title, author, price);
        b1.display();
        b2.display();
    }
}

