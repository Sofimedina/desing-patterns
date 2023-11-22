package org.skm.RemoteControlAPI;

public class StereoOffCommand implements Command {
    Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }
}
