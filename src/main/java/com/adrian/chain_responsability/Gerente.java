package com.adrian.chain_responsability;

public class Gerente extends Aprobador {
    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 50) {
            System.out.println("El hueso fue aprobado por el GERENTE... <3");
        } else System.out.println("No se aprueba\nDescuento Denegado");
    }
}