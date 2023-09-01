package org.skm.SimUDuck;

public class RubberDuck implements Duck, Quackable{

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void display() {
        System.out.println("\nRubber Duck showing");
    }

    @Override
    public void quack() {
        System.out.println("quak");
    }
}
