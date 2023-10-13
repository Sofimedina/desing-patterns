package org.skm.PizzaStoreApp;

public class GreekPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public GreekPizza(PizzaIngredientsFactory ingredientsFactory) {
        this.ingredientsFactory=ingredientsFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dought=ingredientsFactory.createDought();
        sauce=ingredientsFactory.createSauce();
        cheese=ingredientsFactory.createCheese();
    }
}
