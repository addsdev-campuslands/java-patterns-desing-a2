package com.adrian.state;

public class Puesto {

    private String id;
    private EstadoPuesto estado;

    public Puesto(String id) {
        this.id = id;
        estado = new EstadoLibre();
    }

    public void detectarVehiculo(String placa) {
        System.out.println(placa.toUpperCase());
        if(estado instanceof EstadoLibre) {
            estado = new EstadoOcupado();
            estado.gestionar();
            return;
        }
        estado = new EstadoLibre();
        estado.gestionar();
        
    }

    @Override
    public String toString() {
        return id;
    }
}
