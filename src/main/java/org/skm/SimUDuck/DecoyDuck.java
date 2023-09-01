package org.skm.SimUDuck;

public class DecoyDuck implements Duck{

    @Override
    public void swim() {
        System.out.println("swim");
    }


    @Override
    public void display() {
        System.out.println("\nDecoy showing");

    }
}
