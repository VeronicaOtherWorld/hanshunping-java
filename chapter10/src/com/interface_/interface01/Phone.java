package com.interface_.interface01;

// phone类需要实现 usb 接口 规定/声明的方法
// 实现接口,把接口的方法完成
public class Phone implements UsbInterface {
    @Override
    public void start(){
        System.out.println("Phone is running");
    }

    @Override
    public void stop() {
        System.out.println("Phone is stopped");
    }
}
