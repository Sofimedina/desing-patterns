package org.skm.ChocoholicApp;

public class ChocoholicApp {
    public ChocoholicApp() {
    }

    public void run(){
        System.out.println("Chocoholic");

        ChocolateBoiler chocolateBoiler=ChocolateBoiler.getChocolateBoiler();
        System.out.println("Empty:"+chocolateBoiler.isEmpty()+"\n"+"Boiled:"+chocolateBoiler.isBoiled());
        chocolateBoiler.fill();
        System.out.println("Empty:"+chocolateBoiler.isEmpty()+"\n"+"Boiled:"+chocolateBoiler.isBoiled());


    }
}
