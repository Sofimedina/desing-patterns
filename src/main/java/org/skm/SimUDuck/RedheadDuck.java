package org.skm.SimUDuck;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        this.flyBehaviors=new FlyWithWings();
        this.quackBehaviors=new Squack();
    }


    @Override
    public void display() {
        System.out.println("\nred showing");
    }


}
