package org.skm.PizzaStoreApp;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dought createDought() {
        return new ThickCrustDought();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MuzzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]= {new EggPlant(),new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
