package org.skm.SimUDuck;

public class Duck {
    FlyBehaviors flyBehaviors;
    QuackBehaviors quackBehaviors;

    public void setFlyBehaviors(FlyBehaviors flyBehaviors) {
        this.flyBehaviors = flyBehaviors;
    }

    public void setQuackBehaviors(QuackBehaviors quackBehaviors) {
        this.quackBehaviors = quackBehaviors;
    }

    public FlyBehaviors getFlyBehaviors() {
        return flyBehaviors;
    }

    public QuackBehaviors getQuackBehaviors() {
        return quackBehaviors;
    }

    public void performFly(){
        flyBehaviors.fly();
    }

    public void performQuack(){
        quackBehaviors.quack();
    };
    public void swim(){
        System.out.println("swimming");
    };
    public void display(){
        System.out.println("displaying");
    };
}
