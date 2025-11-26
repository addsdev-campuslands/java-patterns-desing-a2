package com.adrian.chain_responsability;

public class Supervisor extends Aprobador {
    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 25 )  System.out.println("Aprobado por el Supervisor");
        else if(siguiente != null) siguiente.aprobarDescuento(porcentaje);
        else System.out.println("No aprobado :'C");
    }
}
