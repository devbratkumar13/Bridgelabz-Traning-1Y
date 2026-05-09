package com.gla.Generics_15;

class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}

public class Runner {
    public static void main(String[] args) {
        Box<Integer> Box = new Box<>();
        Box.set(10);
        System.out.println(Box.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println(doubleBox.get());
    }
}