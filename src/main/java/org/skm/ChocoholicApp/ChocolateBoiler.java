package org.skm.ChocoholicApp;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoilerSingleton=new ChocolateBoiler();

    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getChocolateBoiler(){
        return chocolateBoilerSingleton;
    }

    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty=false;
            boiled=false;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled=false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
