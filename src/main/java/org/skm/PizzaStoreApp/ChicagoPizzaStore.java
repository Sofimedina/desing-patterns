package org.skm.PizzaStoreApp;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientsFactory ingredientsFactory=new ChicagoPizzaIngredientsFactory();
        Pizza pizza=null;

            if (type.equals("Cheese")) {
                pizza=new CheesePizza(ingredientsFactory);
                pizza.setName("Chicago Cheese pizza");
            } else if (type.equals("Greek")) {
                pizza=new CheesePizza(ingredientsFactory);
                pizza.setName("Chicago Greek pizza");
            } else if (type.equals("Pepperoni")) {
                pizza=new CheesePizza(ingredientsFactory);
                pizza.setName("Chicago Pepperoni pizza");
            }

        return pizza;
    }
}
