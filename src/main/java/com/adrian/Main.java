package com.adrian;

import com.adrian.chain_responsability.Cajero;
import com.adrian.chain_responsability.Gerente;
import com.adrian.chain_responsability.Supervisor;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        Gerente gerente = new Gerente();
        Supervisor superv = new Supervisor();
        
        Supervisor supervisor = new Supervisor();

        cajero.setSiguiente(superv);
        superv.setSiguiente(gerente);

        cajero.aprobarDescuento(10);//Cajero
        cajero.aprobarDescuento(22);//Supervisor
        cajero.aprobarDescuento(35);//Gerente

        supervisor.aprobarDescuento(35); // Efe de foca
    }
}