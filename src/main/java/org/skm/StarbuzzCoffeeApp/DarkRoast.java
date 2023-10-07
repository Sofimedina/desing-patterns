package org.skm.StarbuzzCoffeeApp;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public float cost() {
        return 0.99f;
    }
}
