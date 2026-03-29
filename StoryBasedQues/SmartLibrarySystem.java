package com.gla.StoryBasedQues;

class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "Central Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }
}

class TextBook extends Book {
    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {
    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class SmartLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(201, "Tech Monthly", 150);

        int daysLate = 4;

        System.out.println(Book.libraryName);
        System.out.println(b1.calculateFine(daysLate));
        System.out.println(b2.calculateFine(daysLate));
    }
}
