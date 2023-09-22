package org.skm;


import org.skm.SimUDuck.*;
import org.skm.SimUDuck.DecoyDuck;
import org.skm.WeatherORama.WeatherOrama;

import java.util.Scanner;

public class Main {

    public final static String PATTERN_STRATEGY="PATTERN_STRATEGY";
    public final static String PATTERN_OBSERVER="PATTERN_OBSERVER";
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("SELECT EG TO RUN:\n" +
//                "0:EXIT\n" +
//                "1:PATTERN_STRATEGY\n");
//
//
//        switch (sc.nextLine()){
//            case "0":
//                System.out.println("byeee");
//                break;
//            case "1":
//                System.out.println("Running:"+PATTERN_STRATEGY);
//                SimUDuck simUDuck=new SimUDuck();
//                simUDuck.run();
//                break;
//            case "2":
                System.out.println("Running:"+PATTERN_OBSERVER);
                WeatherOrama  weatherOrama=new WeatherOrama();
                weatherOrama.run();
//                break;
//
//            default:
//                System.out.println("byyeee");

//        }
    }
}