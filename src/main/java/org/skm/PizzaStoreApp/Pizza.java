package org.skm.PizzaStoreApp;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dought;
    String sauce;
    List<String> toppings=new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dought "+dought);
        System.out.println("Adding sauce "+sauce);
        System.out.println("Adding toppings:");
        for (String topping:toppings) {
            System.out.println("    "+topping);
        }
    };
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
}
