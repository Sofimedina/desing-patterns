package org.skm.ChocoholicApp;

import org.skm.EnumPatterns;

public class ChocoholicApp {

    public static void main(String[] args) {
        System.out.println("-------"+EnumPatterns.PATTERN_SINGLETON+"--------");

        ChocolateBoiler chocolateBoiler=ChocolateBoiler.getChocolateBoiler();
        System.out.println("Empty:"+chocolateBoiler.isEmpty()+"\n"+"Boiled:"+chocolateBoiler.isBoiled());
        chocolateBoiler.fill();
        System.out.println("Empty:"+chocolateBoiler.isEmpty()+"\n"+"Boiled:"+chocolateBoiler.isBoiled());
    }

}
