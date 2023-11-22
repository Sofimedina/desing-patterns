package org.skm.RemoteControlAPI;

public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+ " Ceiling fan on");
    }

    public void off(){
        System.out.println(location+ " Ceiling fan off");
    }

}
