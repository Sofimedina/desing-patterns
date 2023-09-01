package org.skm;


import org.skm.SimUDuck.Duck;
import org.skm.SimUDuck.MallarDuck;
import org.skm.SimUDuck.RedheadDuck;
import org.skm.SimUDuck.RubberDuck;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern
        MallarDuck mallarDuck=new MallarDuck();
        mallarDuck.display();
        mallarDuck.quack();
        mallarDuck.swim();
        mallarDuck.fly();

        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();


        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();


    }
}