package com.company;

public  class AdvanceRemoteControl extends RemoteControl {
    public AdvanceRemoteControl(Device device) {
        super(device);
    }
    public void setChannel(int number) {
        device.setChannel(number);
    }
}
