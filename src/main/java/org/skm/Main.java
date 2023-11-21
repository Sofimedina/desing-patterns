package org.skm;


import org.skm.ChocoholicApp.ChocoholicApp;
import org.skm.DecoratorIO.UsingJavaIo;
import org.skm.LifeChangingApp.LifeChangingApp;
import org.skm.PizzaStoreApp.PizzaStoreApp;
import org.skm.RemoteControlAPI.RemoteControlApi;
import org.skm.RemoteControlAPI.RemoteLoader;
import org.skm.RemoteControlAPI.SimpleRemoteControl;
import org.skm.SimUDuck.*;
import org.skm.StarbuzzCoffeeApp.StarbuzzCoffee;
import org.skm.WeatherORama.WeatherOrama;

public class Main {

    public final static String PATTERN_STRATEGY = "PATTERN_STRATEGY";
    public final static String PATTERN_OBSERVER = "PATTERN_OBSERVER";
    public final static String PATTERN_DECORATOR = "PATTERN_DECORATOR";
    public final static String PATTERN_FACTORY = "PATTERN_FACTORY";
    private static final String PATTERN_SINGLETON ="PATTERN_SINGLETON" ;
    private static final String PATTERN_COMMAND ="PATTERN_COMMAND" ;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("SELECT EG TO RUN:\n" +
//                "0:EXIT\n" +
//                "1:"+PATTERN_STRATEGY+"\n" +
//                "2:"+PATTERN_OBSERVER+"\n" +
//                "3:"+PATTERN_STRATEGY+ "-LIFE-CHANGING-APP\n"+
//                "4:"+PATTERN_DECORATOR+"\n"+
//                "5:"+PATTERN_DECORATOR+"-DECORATOR IO\n"+
//                "6:"+PATTERN_FACTORY+"\n"+
//                "7:"+PATTERN_SINGLETON+"\n"+
//                "8:"+PATTERN_COMMAND+"\n"
//        );

//        String option_choose = sc.nextLine();
        String option_choose="8";

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

            case "5":
                System.out.println("Running:" + PATTERN_DECORATOR +"-DECORATOR IO");
                UsingJavaIo usingJavaIo=new UsingJavaIo();
                usingJavaIo.run();
                break;

            case "6":
                System.out.println("Running:" + PATTERN_FACTORY);
                PizzaStoreApp pizzaStoreApp=new PizzaStoreApp();
                pizzaStoreApp.run();
                break;
            case "7":
                System.out.println("Running:" + PATTERN_SINGLETON);
                ChocoholicApp chocoholicApp=new ChocoholicApp();
                chocoholicApp.run();
                break;
            case "8":
                System.out.println("Running:" + PATTERN_COMMAND);
                RemoteLoader remoteLoader=new RemoteLoader();
                remoteLoader.run();
                break;

            default:
                System.out.println("byyeee");

        }
    }
}