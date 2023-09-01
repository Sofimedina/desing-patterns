package org.skm;


import org.skm.SimUDuck.Duck;
import org.skm.SimUDuck.MallarDuck;
import org.skm.SimUDuck.RedheadDuck;

public class Main {
    public static void main(String[] args) {

        //Strategy Pattern

        MallarDuck mallarDuck=new MallarDuck();
        mallarDuck.quack();

        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.quack();


    }
}