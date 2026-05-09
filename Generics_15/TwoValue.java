package com.gla.Generics_15;
public class TwoValue {

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        System.out.println(isEqual(10, 10));
        System.out.println(isEqual("Java", "Java"));
        System.out.println(isEqual(5.5, 7.5));
    }
}
