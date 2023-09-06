package org.skm.SimUDuck;

public class RubberDuck extends Duck{

    public RubberDuck(){
        this.quackBehaviors=new Quack();
        this.flyBehaviors=new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("\nRubber Duck showing");
    }

}
