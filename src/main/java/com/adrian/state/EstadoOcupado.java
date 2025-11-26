package com.adrian.state;

public class EstadoOcupado implements EstadoPuesto {
    @Override
    public void gestionar() {
        System.out.println("Esl puesto esta: [Ocupado] ");
    }
}
