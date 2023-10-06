package org.skm.StarbuzzCoffeeApp;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() +0.15f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }
}
