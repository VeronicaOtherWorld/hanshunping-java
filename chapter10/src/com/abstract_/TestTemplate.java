package com.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        Add add = new Add();
        Time time = new Time();
        add.calculateTime(); //这里还是需要有良好的 OOP 基础，对多态
        time.calculateTime();
    }
}
