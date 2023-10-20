package org.skm.ChocoholicApp;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
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
