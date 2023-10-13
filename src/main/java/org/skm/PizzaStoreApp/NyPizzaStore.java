package org.skm.PizzaStoreApp;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;

        PizzaIngredientsFactory pizzaIngredientsFactory=new NYPizzaIngredientsFactory();

        if (type.equals("Cheese")) {
            pizza=new CheesePizza(pizzaIngredientsFactory);
            pizza.setName("NY cheese Pizza");
        }else if(type.equals("Greek")){
            pizza=new GreekPizza(pizzaIngredientsFactory);
            pizza.setName("NY Greek Pizza");
        }else if (type.equals("Pepperoni")){
            pizza=new PepperoniPizza(pizzaIngredientsFactory);
            pizza.setName("NY Pepperoni Pizza");
        }

        return pizza;
    }
}
