package org.skm.PizzaStoreApp;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        {
            if (type.equals("Cheese")) {
                return new ChicagoCheesePizza();
            } else if (type.equals("Greek")) {
                return new ChicagoGreekPizza();
            } else if (type.equals("Pepperoni")) {
                return new ChicagoPepperoniPizza();
            }else return null;

        }
    }
}
