package org.skm.PizzaStoreApp;

import org.skm.PizzaStoreApp.*;

public interface PizzaIngredientsFactory {
    Dought createDought();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();


}
