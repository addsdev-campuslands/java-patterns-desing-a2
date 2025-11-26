package com.adrian.strategy;

public class CobroMensual implements EstrategiaCobro {
    @Override
    public double calcularTotal(long horas) {
        return 150000;
    }
}
