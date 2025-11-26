package com.adrian;

import java.util.ArrayList;
import java.util.List;

import com.adrian.command.Comando;
import com.adrian.command.ComandoIngreso;
import com.adrian.command.ComandoSalida;
import com.adrian.command.Talanquera;

public class Main {
    public static void main(String[] args) {
        Talanquera talanquera = new Talanquera();

        List<Comando> steps = new ArrayList<>();
        steps.add(new ComandoIngreso(talanquera));
        steps.add(new ComandoSalida(talanquera));

        for (Comando comando : steps) {
            System.out.println("---------------------------");
            comando.ejecutar();
        }
    }
}