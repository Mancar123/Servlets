package com.manoj.programs;

import com.manoj.exceptions.RouteNotFoundException;

public class DeliveryApp {
    public static void main(String[] args) {
        try {
            boolean routeExists = false;
            if (!routeExists) throw new RouteNotFoundException("Route not found.");
        } catch (RouteNotFoundException e) {
            System.out.println(""+ e.getMessage());
        }
    }
}

