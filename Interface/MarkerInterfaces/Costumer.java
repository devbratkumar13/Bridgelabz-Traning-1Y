package com.gla.Interface.MarkerInterfaces;
interface SensitiveData {
}
class Customer implements SensitiveData {
    private String info;

    public Customer(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
class SecurityService {

    public static void processData(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data");
        } else {
            System.out.println("Normal data");
        }
    }
}