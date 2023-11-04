package com.DraganGlamocic;

public class Cat {
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow! My name is " + name);
    }


    public Cat(){
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

}
