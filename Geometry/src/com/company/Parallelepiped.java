package com.company;

public class Parallelepiped implements GeometricBody {
    private float length;
    private float height;
    private float width;

    Parallelepiped(float length, float width, float height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Parallelepiped() {
        length = 1;
        height = 1;
        width = 1;
    }

    public float getSurface() {
        return (2 * length * height) + (2 * length * width) + (2 * height * width);
    }

    public float getVolume() {
        return length * width * height;
    }
}
