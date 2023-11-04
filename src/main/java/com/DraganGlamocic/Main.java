package com.DraganGlamocic;

public class Main {
    public static void main(String[] args){

        Cat myCat = new Cat();
        myCat.name = "Willy";
        myCat.meow();
        myCat.age = 3;

        Cat strayCat = new Cat();
        strayCat.name = "Billy";
        strayCat.meow();
        strayCat.age = 5;

        System.out.println("The number of cats in your house is now: " + Cat.getCatCount());
    }
}
