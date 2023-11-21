package org.skm.RemoteControlAPI;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+" Lights on");
    }
    public void off(){
        System.out.println(location+" Lights off");
    }
}
