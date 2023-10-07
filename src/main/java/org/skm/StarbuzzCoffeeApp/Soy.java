package org.skm.StarbuzzCoffeeApp;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        float baseCost=0.15f;
        switch (beverage.getSize()){
            case TALL:
                baseCost=10;
                break;
            case GRANDE:
                baseCost=15;
                break;
            case VENTI:
                baseCost=20;
                break;
        }
        return beverage.cost() +baseCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }
}
