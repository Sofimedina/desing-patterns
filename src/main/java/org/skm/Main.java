package org.skm;


import org.skm.LifeChangingApp.LifeChangingApp;
import org.skm.SimUDuck.*;
import org.skm.StarbuzzCoffeeApp.StarbuzzCoffee;
import org.skm.WeatherORama.WeatherOrama;

import java.util.Scanner;

public class Main {

    public final static String PATTERN_STRATEGY = "PATTERN_STRATEGY";
    public final static String PATTERN_OBSERVER = "PATTERN_OBSERVER";
    public final static String PATTERN_DECORATOR = "PATTERN_DECORATOR";

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("SELECT EG TO RUN:\n" +
//                "0:EXIT\n" +
//                "1:"+PATTERN_STRATEGY+"\n" +
//                "2:"+PATTERN_OBSERVER+"\n" +
//                "3:"+PATTERN_STRATEGY+ "-LIFE-CHANGING-APP\n"+
//                "4:"+PATTERN_DECORATOR+"\n"
//        );
//
//        String option_choose = sc.nextLine();
        String option_choose="4";

        switch (option_choose) {
            case "0":
                System.out.println("byeee");
                break;
            case "1":
                System.out.println("Running:" + PATTERN_STRATEGY);
                SimUDuck simUDuck = new SimUDuck();
                simUDuck.run();
                break;
            case "2":
                System.out.println("Running:" + PATTERN_OBSERVER);
                WeatherOrama weatherOrama = new WeatherOrama();
                weatherOrama.run();
                break;

            case "3":
                System.out.println("Running:" + PATTERN_OBSERVER + "-LIFE-CHANGING-APP");
                LifeChangingApp lifeChangingApp = new LifeChangingApp();
                lifeChangingApp.run();
                break;

            case "4":
                System.out.println("Running:" + PATTERN_DECORATOR );
                StarbuzzCoffee starbuzzCoffee = new StarbuzzCoffee();
                starbuzzCoffee.run();
                break;

            default:
                System.out.println("byyeee");

        }
    }
}