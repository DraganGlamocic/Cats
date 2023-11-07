package com.DraganGlamocic;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("Woof! Woof!");
    }

    public void move() {
        super.move();
        System.out.println(name + " is wagging it's tail.");

    }

    public void fetch() {
        System.out.println(name + " is chasing his balls.");
    }
}
