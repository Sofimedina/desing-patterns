package org.skm.RemoteControlAPI;

public class RemoteLoader {

    public RemoteLoader() {
    }

    public void run() {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, ()-> livingRoomLight.on(), ()-> livingRoomLight.off());
        remoteControl.setCommand(1, ()-> kitchenLight.on(),()->kitchenLight.off());
        remoteControl.setCommand(2,()-> ceilingFan.on(),()-> ceilingFan.off());
        remoteControl.setCommand(3,()->stereo.on(),()->stereo.off());
        remoteControl.setCommand(4,()->garageDoor.up(), ()->garageDoor.down());


        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

    }

}
