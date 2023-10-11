package org.skm.PizzaStoreApp;

public abstract class Pizza {

    void prepare(){
        System.out.println("Preparing");
    };
    void bake(){
        System.out.println("Baking");
    };
    void cut(){
        System.out.println("Cutting");
    };
    void box(){
        System.out.println("Boxing");
    };
    
}
