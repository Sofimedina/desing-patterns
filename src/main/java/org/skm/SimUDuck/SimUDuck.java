package org.skm.SimUDuck;

import org.skm.EnumPatterns;

public class SimUDuck {

    public static void main(String[] args) {
        System.out.println("-------" + EnumPatterns.PATTERN_STRATEGY + "--------");
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performQuack();
        mallarDuck.performFly();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();


        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();;

    }

}
