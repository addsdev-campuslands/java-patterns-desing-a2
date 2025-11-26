package com.adrian.strategy;

public class CobroHora implements EstrategiaCobro {
    @Override
    public double calcularTotal(long horas) {
        return 4500 * horas;
    }
}
