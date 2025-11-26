package com.adrian.state;

public class EstadoLibre implements EstadoPuesto {
    @Override
    public void gestionar() {
        System.out.println("Registro en el sistema que esta: Libre");
    }
}
