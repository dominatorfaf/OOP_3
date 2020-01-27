package com.company;

public class Cube implements GeometricBody{
    private float length;

    Cube(float length) {
        this.length = length;
    }

    Cube() {
        length = 1;
    }

    public float getSurface() {
        return 6 * (length * length);
    }

    public float getVolume() {
        return length * length * length;
    }

}
