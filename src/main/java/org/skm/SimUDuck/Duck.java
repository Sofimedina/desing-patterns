package org.skm.SimUDuck;

public class Duck {
    FlyBehaviors flyBehaviors;
    QuackBehaviors quackBehaviors;

    public void performQuack(){
        this.quackBehaviors.quack();
    }

    public void performFly(){
        this.flyBehaviors.fly();
    };
    public void swim(){
        System.out.println("swimming");
    };
    public void display(){
        System.out.println("displaying");
    };
}
