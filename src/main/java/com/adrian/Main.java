package com.adrian;

import com.adrian.state.Puesto;

public class Main {
    public static void main(String[] args) {
        
        Puesto puestoA1 = new Puesto("a-1");
        System.out.println("----------------");
        puestoA1.detectarVehiculo("XBV123");
        puestoA1.detectarVehiculo("XBV123");

    }
}