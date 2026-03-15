package com.gla.Constructor.Level_2;

import java.util.Scanner;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MovieTicket m = new MovieTicket();
        m.movieName = in.nextLine();
        int seat = in.nextInt();
        double cost = in.nextDouble();
        m.bookTicket(seat, cost);
        m.displayDetails();
    }
}
