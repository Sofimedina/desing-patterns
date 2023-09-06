package org.skm.SimUDuck;

public class MallarDuck extends Duck {

    public MallarDuck(){
        this.quackBehaviors=new Quack();
        this.flyBehaviors=new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("\nmallar showing");
    }

}
