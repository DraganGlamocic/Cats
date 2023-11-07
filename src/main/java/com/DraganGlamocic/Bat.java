package com.DraganGlamocic;

public class Bat extends Animal implements Flyer {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("flapper");
    }

    public void move(){
        fly();
    }

    @Override
    public void speak(){
        System.out.println("<sonar>");

    }
}
