package org.skm.PizzaStoreApp;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYCheesePizza();
        }else if(type.equals("Greek")){
            return new NYGreekPizza();
        }else if (type.equals("Pepperoni")){
            return new NYPepperoniPizza();
        }else return null;
    }
}
