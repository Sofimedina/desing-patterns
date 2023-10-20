package org.skm.PizzaStoreApp;

public class CheesePizza extends Pizza{

    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.ingredientsFactory=pizzaIngredientsFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dought=ingredientsFactory.createDought();
        sauce=ingredientsFactory.createSauce();
        cheese=ingredientsFactory.createCheese();

    }


}
