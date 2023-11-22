package org.skm.RemoteControlAPI;

public class RemoteLoader {

    public RemoteLoader() {
    }

    public void run() {
        RemoteControl remoteControl = new RemoteControl();
        Light LivingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, new LightOnCommand(LivingRoomLight), new LightOffCommand(LivingRoomLight));
        remoteControl.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommand(2, new CeilingFanOnCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(3, new StereoWithCDCommand(stereo), new StereoOffCommand(stereo));
        remoteControl.setCommand(4, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));


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
