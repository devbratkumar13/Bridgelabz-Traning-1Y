package com.gla.Threads;

import java.time.LocalTime;
class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(LocalTime.now() + " | " + name +
                    " | Thread: " + t.getName() +
                    " | Priority: " + t.getPriority() +
                    " | Cycle: " + i);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        Thread temp = new Thread(new Device("Temperature Sensor", 5000), "TempThread");
        Thread security = new Thread(new Device("Security Camera", 3000), "SecurityThread");
        Thread light = new Thread(new Device("Light Controller", 4000), "LightThread");
        Thread door = new Thread(new Device("Door Lock Monitor", 6000), "DoorThread");

        security.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        security.start();
        temp.start();
        light.start();
        door.start();

        security.join();
        temp.join();
        light.join();
        door.join();
    }
}
