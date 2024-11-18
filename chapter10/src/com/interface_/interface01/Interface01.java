package com.interface_.interface01;


/*
* 接口就是给一些没有实现的方法,封装到一起,到某个类要使用的时候,
* 根据具体情况把方法写出来.
*
* syntax:
*
* interface name {
*   attribute
*   method
* }
*
* class classname implements interface name {
*   unique attribute
*   unique method
*   the abstract method that belong to interface,
*   and must implement it
* }
*
* */
public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();

    //     computer
        Computer computer = new Computer();

    //    把手机接入计算机
        computer.work(phone);
        computer.work(camera);
    }
}
