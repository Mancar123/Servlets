package com.manoj.programs;

import com.manoj.exceptions.InvalidZoomLevelException;

public class MapZoom {
    public static void main(String[] args) {
        int zoom = 25, maxZoom = 20;
        try {
            if (zoom > maxZoom)
                throw new InvalidZoomLevelException("Zoom level exceeds maximum.");
        } catch (InvalidZoomLevelException e) {
            System.out.println(" " + e.getMessage());
        }
    }

}
