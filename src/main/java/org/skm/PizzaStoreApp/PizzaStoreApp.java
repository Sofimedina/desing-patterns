package org.skm.PizzaStoreApp;

import org.skm.EnumPatterns;

public class PizzaStoreApp {

    public static void main(String[] args) {
        System.out.println("-------"+ EnumPatterns.PATTERN_FACTORY+"--------");
        System.out.println("Pizza store app");
        PizzaStore NYStore=new NyPizzaStore();
        PizzaStore ChicagoStore=new ChicagoPizzaStore();

        Pizza pizza=NYStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n"+pizza.toString());


        pizza=ChicagoStore.orderPizza("Cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n"+pizza.toString());
    }
}
