package org.skm.RemoteControlAPI;

public class RemoteControlApi {

    public void run() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(new LightOnCommand(new Light()));
        simpleRemoteControl.buttonWasPressed();
    }
}
