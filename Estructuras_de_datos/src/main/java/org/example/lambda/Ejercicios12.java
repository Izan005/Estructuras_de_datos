package org.example.lambda;

public class Ejercicios12 {
    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio1(){
        Ejecutor ejecutor = (num) -> {return num < 10;};

        System.out.println(ejecutor.ejecutar(11));
        System.out.println(ejecutor.ejecutar(2));

    }

    public static void ejercicio2(){
        VerificarVoto voto = (nombre, edad) -> {
            System.out.println("Probando con " + nombre + " de " + edad + " años...");
            if (edad > 17){
                return true;
            }
            return false;
        };

        System.out.println(voto.puedeVotar("María", 14));

    }
}
