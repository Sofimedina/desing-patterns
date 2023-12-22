package org.skm.RemoteControlAPI;

import org.skm.EnumPatterns;

public class RemoteControlApi {
    public static void main(String[] args) {
        System.out.println("-------"+ EnumPatterns.PATTERN_COMMAND+"--------");
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(new LightOnCommand(new Light("Default")));
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(new GarageDoorOpenCommand(new GarageDoor("Garage")));
        simpleRemoteControl.buttonWasPressed();
    }
}
