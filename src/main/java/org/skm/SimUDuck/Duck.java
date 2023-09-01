package org.skm.SimUDuck;

public abstract class Duck {
    public void quack(){
        System.out.println("quak quak");;
    };
    public void swim(){
        System.out.println("swimmimg");;
    };
    public abstract void fly();

    public abstract void display();
}
