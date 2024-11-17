package com.homework.HomeWork09;

public class HomeWork09 {
}

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
    public LabeledPoint(int x, int y) {
        super(x, y);
    }
}