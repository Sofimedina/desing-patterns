package org.skm.RemoteControlAPI;

public class RemoteLoader {

    public void run() {
        RemoteControl remoteControl=new RemoteControl();
        Light LivingRoomLight=new Light("Living Room");
        GarageDoor garageDoor=new GarageDoor();

       remoteControl.setCommand(0,new LightOnCommand(LivingRoomLight),new LightOffCommand(LivingRoomLight));
       remoteControl.setCommand(1,new GarageDoorOpenCommand(garageDoor),new GarageDoorCloseCommand(garageDoor));

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

    }

}
