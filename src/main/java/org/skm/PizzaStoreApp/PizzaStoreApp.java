package org.skm.PizzaStoreApp;

public class PizzaStoreApp {
    public PizzaStoreApp() {
    }

    public void run(){
        System.out.println("Pizza store app");
        PizzaStore NYStore=new NyPizzaStore();
        PizzaStore ChicagoStore=new ChicagoPizzaStore();

        Pizza pizza=NYStore.orderPizza("Cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");


        pizza=ChicagoStore.orderPizza("Cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");


    }
}
