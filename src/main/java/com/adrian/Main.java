package com.adrian;

import com.adrian.observer.PantallaDeudores;
import com.adrian.observer.PantallaSeguridad;
import com.adrian.observer.SensorIngreso;

public class Main {
    public static void main(String[] args) {
        String placa = "xyz123".toUpperCase();
        PantallaSeguridad security = new PantallaSeguridad();
        PantallaDeudores loan = new PantallaDeudores();
        //Sensor
        SensorIngreso sensorIngreso = new SensorIngreso();

        //No observadores
        sensorIngreso.detectarVehiculo(placa);
        System.out.println("----------------");

        //Agregar observadores para notificar
        sensorIngreso.agregar(security);
        sensorIngreso.detectarVehiculo(placa);

        System.out.println("----------------");

        sensorIngreso.agregar(loan);
        sensorIngreso.detectarVehiculo(placa);

        System.out.println("----------------");

    }
}