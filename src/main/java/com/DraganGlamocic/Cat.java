package com.DraganGlamocic;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Maoooww!");
    }

//    public static final int MAX_LIVES = 9;
//    private static int catCount = 0;
//    String name;
//    int age;
//    int livesRemaining;
//
//    public void meow() {
//        System.out.println("Meow! My name is " + name + ".");
//    }
//    public void loseLife(){
//        livesRemaining--;
//    }
//
//    public Cat() {
//        livesRemaining = MAX_LIVES;
//        catCount++;
//    }
//
//    public static int getCatCount() {
//        return catCount;
//    }
}
