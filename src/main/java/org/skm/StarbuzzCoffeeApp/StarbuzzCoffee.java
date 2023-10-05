package org.skm.StarbuzzCoffeeApp;

public class StarbuzzCoffee {
    public StarbuzzCoffee() {
    }

    public void run(){
        Beverage beverage1=new HouseBlend();
        beverage1=new Whip(beverage1);
        beverage1=new Whip(beverage1);


        System.out.println(beverage1.getDescription()+" "+beverage1.cost());
    }

}
