package LambdaExpression;
import java.util.*;

class Product {
    int id;
    String name;
    double price;
    double rating;
    double discount;

    Product(int id, String name, double price, double rating, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return id + " " + name + " Price:" + price +
                " Rating:" + rating + " Discount:" + discount;
    }
}

public class Q2 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 70000, 4.5, 10));
        products.add(new Product(2, "Phone", 30000, 4.8, 15));
        products.add(new Product(3, "Tablet", 20000, 4.2, 20));

        products.sort((p1, p2) ->
                Double.compare(p1.price, p2.price));

        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        products.sort((p1, p2) ->
                Double.compare(p2.rating, p1.rating));

        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        products.sort((p1, p2) ->
                Double.compare(p2.discount, p1.discount));

        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}