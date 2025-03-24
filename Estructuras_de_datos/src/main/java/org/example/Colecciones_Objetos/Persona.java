package org.example.Colecciones_Objetos;

import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@ToString
public class Persona {
    static Random random = new Random();
    @Getter
    private int edad;

    public Persona(){
        edad = generarEdad();
    }

    public int generarEdad(){
        return random.nextInt(3,100)+1;
    }
}
