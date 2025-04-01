package org.example.iterator;

import lombok.Getter;

public class Casino {


    private String numero;

    private double apuesta_minima;

    public Casino(String numero, double apuesta_minima){
        this.numero = numero;
        this.apuesta_minima = apuesta_minima;
    }

    public String getNumero() {
        return numero;
    }

    public double getApuesta_minima() {
        return apuesta_minima;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "numero='" + numero + '\'' +
                ", apuesta_minima=" + apuesta_minima +
                '}';
    }
}
