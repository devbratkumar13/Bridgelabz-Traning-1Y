package com.gla.StoryBasedQues;
class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}

class BusinessContact extends Contact {
    String companyName;

    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    void display() {
        System.out.println("Name: " + name.toUpperCase() + ", Phone: " + phoneNumber + ", Company: " + companyName);
    }
}

public class ContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact("Ravi", "9876543210");
        Contact c2 = new BusinessContact("Priya", "9123456780", "Infosys");

        c1.display();
        c2.display();
    }
}
