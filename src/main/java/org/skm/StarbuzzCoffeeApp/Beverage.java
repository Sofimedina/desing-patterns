package org.skm.StarbuzzCoffeeApp;


public abstract class Beverage {
    String description="Unknown beverage";

    public enum Size {TALL,GRANDE,VENTI};

    Size size= Size.TALL;

    public String getDescription(){
        return description;
    };

    public abstract float cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
