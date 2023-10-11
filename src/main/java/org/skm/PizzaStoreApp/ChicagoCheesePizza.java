package org.skm.PizzaStoreApp;

public class ChicagoCheesePizza extends Pizza{

    public ChicagoCheesePizza() {

        name="Chicago Cheese Pizza";
        dought="Thick crust pizza";
        sauce="Cheese and sauce";

        toppings.add("Parmesan");
    }

    @Override
    void cut() {
        System.out.println("Cutting is square slices");
    }
}
