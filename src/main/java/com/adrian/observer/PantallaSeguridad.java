package com.adrian.observer;

public class PantallaSeguridad implements Observador {
    @Override
    public void notificar(String placa) {
        System.out.println("Pantalla seguridad\nReporta ingreso de vehiculo con : "+ placa);
    }
}
