package com.gla.Inheritance.MultilevelInheriance;
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + (fee - (fee * discount / 100)));
    }
}