package com.adrian.command;

public class ComandoSalida implements Comando {
    private Talanquera talanquera;

    public ComandoSalida(Talanquera talanquera) {
        this.talanquera = talanquera;
    }
    @Override
    public void ejecutar() {
        talanquera.bajar();
    }
}
