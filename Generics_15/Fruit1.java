package com.gla.Generics_15;

class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }
}

class Apple extends Fruit {
    Apple(String name) {
        super(name);
    }
}

class Mango extends Fruit {
    Mango(String name) {
        super(name);
    }
}

class FruitBox<T extends Fruit> {

    private T fruit;

    public void addFruit(T fruit) {
        this.fruit = fruit;
    }

    public void displayFruit() {
        System.out.println("Fruit: " + fruit.name);
    }
}

public class Fruit1{
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple("Red Apple"));
        appleBox.displayFruit();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango("Alphonso Mango"));
        mangoBox.displayFruit();

    }
}
