package org.skm.SimUDuck;

public class SimUDuck {
    //Strategy Pattern
    private DecoyDuck decoyDuck;
    private MallarDuck mallarDuck;
    private  RedheadDuck redheadDuck;
    private RubberDuck rubberDuck;

    public SimUDuck() {
        this.decoyDuck = new DecoyDuck();
        this.mallarDuck = new MallarDuck();
        this.redheadDuck = new RedheadDuck();
        this.rubberDuck = new RubberDuck();
    }

    public void run(){
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
        rubberDuck.performQuack();
        rubberDuck.performFly();

        DecoyDuck decoyDuck=new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }


}
