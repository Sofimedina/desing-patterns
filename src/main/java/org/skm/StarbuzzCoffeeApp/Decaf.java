package org.skm.StarbuzzCoffeeApp;

public class Decaf extends Beverage{
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 1.05f;
    }
}
