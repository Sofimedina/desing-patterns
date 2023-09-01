package org.skm.SimUDuck;

public class MallarDuck implements Duck, Quackable, Flyable {

    @Override
    public void swim() {
        System.out.println("swim");
    }


    @Override
    public void display() {
        System.out.println("\nmallar showing");
    }

    @Override
    public void quack() {
        System.out.println("quak");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
