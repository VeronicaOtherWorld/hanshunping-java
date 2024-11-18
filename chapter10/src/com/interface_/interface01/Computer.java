package com.interface_.interface01;

public class Computer {
    // 接入接口, computer working
    public void work(UsbInterface usbInterface) {
        // 通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
