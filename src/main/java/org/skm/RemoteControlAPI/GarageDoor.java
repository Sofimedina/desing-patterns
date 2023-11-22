package org.skm.RemoteControlAPI;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }


    public void up(){
        System.out.println(location+ " door going up");
    }

    public void down(){
        System.out.println(location+ " door going down");
    }
}
