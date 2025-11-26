package com.adrian.observer;

public class PantallaDeudores implements Observador {
    @Override
    public void notificar(String placa) {
        System.out.println("Validando deudor\nVehiculo con placa: "+placa);
    }
}
