package org.skm.StarbuzzCoffeeApp;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public float cost() {
        return beverage.cost()+ 0.1f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whith whip";
    }
}
