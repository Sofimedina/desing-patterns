package org.skm.SimUDuck;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("mallar quak quak");
    }

    @Override
    public void swim() {
        System.out.println("mallar swim");
    }

    @Override
    public void display() {
        System.out.println("mallar showing");
    }
}
