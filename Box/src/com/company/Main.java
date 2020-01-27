package com.company;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(10.0, 10.0, 15.0);
        Box box2 = new Box(10.0);
        Box box3 = new Box();

        box1.calculateBoxSurface();
        box2.calculateBoxSurface();
        box3.calculateBoxSurface();

        box1.calculateBoxVolume();
        box2.calculateBoxVolume();
        box3.calculateBoxVolume();

        box1.printSurface();
        box2.printSurface();
        box3.printSurface();

        box1.printVolume();
        box2.printVolume();
        box3.printVolume();
    }
}
