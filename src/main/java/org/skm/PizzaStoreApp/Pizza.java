package org.skm.PizzaStoreApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    Dought dought;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clams clams;

    String name;

    public void setName(String name) {
        this.name = name;
    }

    abstract void prepare();

    void bake(){
        System.out.println("Baking for 20 min a 300");
    };
    void cut(){
        System.out.println("Cutting in diagonal slices");
    };
    void box(){
        System.out.println("Place pizza in box");
    };

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dought=" + dought +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", veggies=" + Arrays.toString(veggies) +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                ", name='" + name + '\'' +
                '}';
    }
}
