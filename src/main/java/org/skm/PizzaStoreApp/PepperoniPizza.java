package org.skm.PizzaStoreApp;

public class PepperoniPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory) {
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
