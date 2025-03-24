package org.example.Colecciones_Objetos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cine {
    static Random random = new Random();
    static Queue<Persona> cola = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("*** CINE ***");
        generarCola();
        System.out.println("Hay " + cola.size() + " personas en la cola: "  + cola);
        System.out.println("La recaudación ha sido de " + cantidadRecaudada() + " €.");
    }

    public static void generarCola(){

        int tamaño = random.nextInt(250)+1;
        for (int i = 0; i < tamaño; i++) {
            cola.offer(new Persona());
        }
    }

    public static float cantidadRecaudada(){
        float dinero = 0;
        while(!cola.isEmpty()){
            if (cola.peek().getEdad() >= 3 && cola.peek().getEdad() <= 10){
                dinero += 1;
            } else if (cola.peek().getEdad() >= 11 && cola.peek().getEdad() <= 17) {
                dinero += 2.5;
            } else if (cola.peek().getEdad() >= 18) {
                dinero += 3.5;
            }
            cola.poll();
        }

        return dinero;
    }
}
