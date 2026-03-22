package com.gla.Interface.MarkerInterfaces;

public class Runner2 {
    public static void main(String[] args) {

        Customer c = new Customer("Secret Info");
        String normal = "Public Info";

        SecurityService.processData(c);
        SecurityService.processData(normal);
    }
}
