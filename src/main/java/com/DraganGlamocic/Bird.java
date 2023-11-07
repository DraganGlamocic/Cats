package com.DraganGlamocic;

public class Bird extends Animal implements Flyer {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Chirp! Chirp!");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high.");
    }

}
