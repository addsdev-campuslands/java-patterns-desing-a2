package com.adrian;

import com.adrian.strategy.CobroHora;
import com.adrian.strategy.CobroHoraDescuento;
import com.adrian.strategy.CobroMensual;
import com.adrian.strategy.EstrategiaCobro;

public class Main {
    public static void main(String[] args) {
     EstrategiaCobro hora = new CobroHora();
     EstrategiaCobro mes = new CobroMensual();
     EstrategiaCobro descuento = new CobroHoraDescuento();

     mostrarTotal(mes, 10);
     mostrarTotal(hora, 10);
     mostrarTotal(descuento, 10);
    }

    public static void mostrarTotal(EstrategiaCobro cobro, int horas) {
        System.out.println("\nTOTAL");
        System.out.println("El valor es de: " + cobro.calcularTotal(horas));
        System.out.println("Por un total de horas de : " + horas);
    }
}