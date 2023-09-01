package org.skm;


import org.skm.SimUDuck.Duck;
import org.skm.SimUDuck.MallarDuck;
import org.skm.SimUDuck.RedheadDuck;
import org.skm.SimUDuck.RubberDuck;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern

        MallarDuck mallarDuck=new MallarDuck();
        mallarDuck.quack();
        mallarDuck.swim();
        mallarDuck.fly();
        mallarDuck.display();


        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();
        redheadDuck.display();

        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.display();


    }
}