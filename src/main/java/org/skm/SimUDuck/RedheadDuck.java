package org.skm.SimUDuck;

public class RedheadDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("redhead quack");
    }

    @Override
    public void swim() {
        System.out.println("red swim");
    }

    @Override
    public void display() {
        System.out.println("red showing");
    }
}
