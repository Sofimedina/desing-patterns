package org.skm;


import org.skm.SimUDuck.*;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern
        MallarDuck mallarDuck=new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();


        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        DecoyDuck decoyDuck=new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();


    }
}