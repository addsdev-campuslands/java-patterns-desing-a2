package com.adrian.strategy;

public class CobroHoraDescuento implements EstrategiaCobro {
    private double percent = 0.05;

    @Override
    public double calcularTotal(long horas) {
        var total = 4500 * horas;
        return total > 10000 ? total - total * percent : total;
    }
}
