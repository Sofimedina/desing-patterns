package org.skm.RemoteControlAPI;

public class StereoWithCDCommand implements Command {

    Stereo stereo;

    public StereoWithCDCommand(Stereo stereo) {
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }
}
