package com.DraganGlamocic;

// import com.DraganGlamocic.animals.*;
public class Main {
    public static void main(String[] args) {


        Animal a = new Dog("Jeff");
        Cat c = new Cat("Billy");
        Dog d = new Dog("Rex");

        a.speak();
        a.move();
//        a.fetch();
        System.out.println();

        c.speak();
        c.move();
        System.out.println();

        d.speak();
        d.move();
        d.fetch();
        System.out.println();


//        c.fetch();

//        myCat.name = "Willy";
//        myCat.meow();
//        myCat.age = 3;
//        myCat.loseLife();
//        System.out.println("I have " + myCat.livesRemaining + " lives left. \n");
//
//        Cat strayCat = new Cat();
//        strayCat.name = "Billy";
//        strayCat.meow();
//        strayCat.age = 5;
//        System.out.println("I have " + strayCat.livesRemaining + " lives left.");
//        System.out.println();
//
//        System.out.println("The number of cats in your house is now: " + Cat.getCatCount());
//        System.out.println();


    }
}
