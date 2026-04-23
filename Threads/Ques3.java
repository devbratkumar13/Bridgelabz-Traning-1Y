package com.gla.Threads;

class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;
    private String type;

    public Order(int orderId, String restaurant, int deliveryTime, String type) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
        this.type = type;
    }
    public void run() {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();

        System.out.println("Order " + orderId + " (" + type + ") | " + restaurant +
                " | Agent: " + t.getName() + " | Status: Picked up");

        try {
            Thread.sleep(deliveryTime * 500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order " + orderId + " (" + type + ") | " + restaurant +
                " | Agent: " + t.getName() + " | Status: In Transit");

        try {
            Thread.sleep(deliveryTime * 500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order " + orderId + " (" + type + ") | " + restaurant +
                " | Agent: " + t.getName() + " | Status: Delivered");

        long end = System.currentTimeMillis();
        System.out.println("Order " + orderId + " completed in " + (end - start) + " ms");
    }
}
public class Ques3 {
    public static void main(String[] args) throws InterruptedException {

        Thread o1 = new Thread(new Order(101, "Dominos", 4, "Express"), "Agent-1");
        Thread o2 = new Thread(new Order(102, "KFC", 6, "Standard"), "Agent-2");
        Thread o3 = new Thread(new Order(103, "BurgerKing", 5, "Economy"), "Agent-3");
        Thread o4 = new Thread(new Order(104, "PizzaHut", 3, "Express"), "Agent-4");
        Thread o5 = new Thread(new Order(105, "Subway", 7, "Standard"), "Agent-5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(10);
        o5.setPriority(5);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();

        o1.join();
        o2.join();
        o3.join();
        o4.join();
        o5.join();
    }
}
