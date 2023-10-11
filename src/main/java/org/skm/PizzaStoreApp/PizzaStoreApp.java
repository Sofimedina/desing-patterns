package org.skm.PizzaStoreApp;

public class PizzaStoreApp {
    public PizzaStoreApp() {
    }

    public void run(){
        System.out.println("Pizza store app");
        PizzaStore pizzaStore=new NyPizzaStore();
        pizzaStore.orderPizza("Cheese");


    }
}
