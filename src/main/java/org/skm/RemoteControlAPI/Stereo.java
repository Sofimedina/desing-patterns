package org.skm.RemoteControlAPI;

public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+ " Stereo on");
    }

    public void off(){
        System.out.println(location+ " Stereo  off");
    }

    public void setCD(){
        System.out.println(location+" Stereo Setting Cd");
    }

    public void setVolume(int val){
        System.out.println(location+" Stereo Vol set to:"+val);
    }
}
