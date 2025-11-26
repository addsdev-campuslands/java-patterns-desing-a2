package com.adrian.observer;

import java.util.ArrayList;
import java.util.List;

public class SensorIngreso {
    private List<Observador> observadores = new ArrayList<>();

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void detectarVehiculo(String placa) {
        for (Observador observador : observadores) observador.notificar(placa);
    }
}
