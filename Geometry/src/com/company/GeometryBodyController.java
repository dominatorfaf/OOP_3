package com.company;

import java.util.ArrayList;

public class GeometryBodyController {
    static public GeometricBody getMaxSurfaceBody(ArrayList<GeometricBody> bodies)
    {
        float maxSurface = 0;
        GeometricBody maxGeometricBody = null;

        for (GeometricBody geometricBody : bodies) {
            float currentSurface = geometricBody.getSurface();
            if (currentSurface > maxSurface)
            {
                maxSurface = currentSurface;
                maxGeometricBody = geometricBody;
            }
        }

        return maxGeometricBody;
    }

    static public GeometricBody getMaxVolumeBody(ArrayList<GeometricBody> bodies)
    {
        float maxVolume = 0;
        GeometricBody maxGeometricBody = null;

        for (GeometricBody geometricBody : bodies) {
            float currentVolume = geometricBody.getVolume();
            if (currentVolume > maxVolume)
            {
                maxVolume = currentVolume;
                maxGeometricBody = geometricBody;
            }
        }

        return maxGeometricBody;
    }
}
