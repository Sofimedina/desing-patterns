package org.skm.StarbuzzCoffeeApp;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();

}
