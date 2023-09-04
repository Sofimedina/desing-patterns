package org.skm.SimUDuck;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        this.flyBehaviors=new FlyNoWay();
        this.quackBehaviors=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("\nDecoy showing");

    }

}
