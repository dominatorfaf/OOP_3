package com.company;

class Sphere implements GeometricBody {
    private float radius;

    Sphere(float radius)
    {
        this.radius = radius;
    }

    Sphere()
    {
        radius = 1;
    }

    public float getSurface()
    {
        return 4 * (float)Math.PI * (radius * radius);
    }

    public float getVolume()
    {
        return (4/3) * (float)Math.PI * (radius * radius * radius);
    }
}
