package org.skm.StarbuzzCoffeeApp;

public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost()+0.10f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Steamed milk";
    }
}
