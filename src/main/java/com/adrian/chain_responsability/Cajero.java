package com.adrian.chain_responsability;

public class Cajero extends Aprobador {

    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 10) {
            System.out.println("Cajero aprueba descuento ;D");
        } else if(siguiente != null) siguiente.aprobarDescuento(porcentaje);
    }
    
}
