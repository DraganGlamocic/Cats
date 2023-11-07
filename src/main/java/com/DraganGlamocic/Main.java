package com.DraganGlamocic;

// import com.DraganGlamocic.animals.*;
public class Main {
    public static void main(String[] args) {


        Animal a = new Dog("Jeff");
        Bird b = new Bird("Golgamord the Messenger");
        Cat c = new Cat("Billy");
        Dog d = new Dog("Rex");

        Animal arr[] = {
                new Bird("Wolodaw the Destroyer"),
                new Cat("Mittens"),
                new Dog("Schmitty"),
                new Bat("Zorba")
        };

        Flyer f[] = {
                new Bird("Wolodaw the Destroyer"),
                new Airplane("UFO"),
                new Bat("Zorba")
        };

        a.speak();
        a.move();
//        a.fetch();    // Animals are too Abstract to fetch.
        System.out.println();

        b.speak();
        b.move();
        b.fly();
        System.out.println();

        c.speak();
        c.move();
        System.out.println();

        d.speak();
        d.move();
        d.fetch();
        System.out.println();

        for (Animal x : arr) {
            System.out.println("Animal " + x.getName());
            x.speak();
            x.move();
            System.out.println();
        }
        System.out.println();

        for (Flyer x : f) {
            x.fly();
        }

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
