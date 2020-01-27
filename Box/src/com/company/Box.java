package com.company;

public class Box {
    private double width = 1.0, depth = 1.0, height = 1.0, surface, volume;

    public Box(double a, double b, double c){
        width = a;
        depth = b;
        height = c;

    }

    public Box(double a){
        width = a;
        depth = a;
        height = a;

    }

    public Box(){}


    public void calculateBoxSurface(){
        surface = 2 * ( width * depth + width * height + height * depth);
    }

    public void calculateBoxVolume(){
        volume = width * depth * height;
    }

    public void printSurface() {
        System.out.println("Box's Surface: " + surface);
    }

    public void printVolume() {
        System.out.println("Box's Volume: " + volume);
    }

}
