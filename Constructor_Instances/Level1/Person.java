package com.gla.Constructor_Instances.Level1;
import java.util.Scanner;
class Person {
    String name;
    int age;
    Person(String n, int a) {
        name = n;
        age = a;
    }
    Person(Person p) {
        name = p.name;
        age = p.age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        Person p1 = new Person(name, age);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}
