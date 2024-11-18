package com.interface_.interface01;

public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("camera running");
    }

    @Override
    public void stop() {
        System.out.println("camera stopped");
    }
}
