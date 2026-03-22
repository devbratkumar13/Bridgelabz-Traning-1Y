package com.gla.Interface.MarkerInterfaces;

public class Runner1 {
    public static void main(String[] args) throws Exception {

        Prototype p1 = new Prototype(10);
        Prototype p2 = (Prototype) p1.clone();

        System.out.println(p1.getValue());
        System.out.println(p2.getValue());
    }
}

