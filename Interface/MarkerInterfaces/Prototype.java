package com.gla.Interface.MarkerInterfaces;

class Prototype implements Cloneable {
    private int value;

    public Prototype(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}