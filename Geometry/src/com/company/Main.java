package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            GeometricBody cube = new Cube(5);
            GeometricBody parallelepiped = new Parallelepiped(3,2,4);
            GeometricBody sphere = new Sphere(7);

        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();

        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        for ( GeometricBody geometricBody : bodies
             ) {
            System.out.println(geometricBody.getSurface());
        }

        System.out.println(GeometryBodyController.getMaxSurfaceBody(bodies).getSurface());

    }
}
