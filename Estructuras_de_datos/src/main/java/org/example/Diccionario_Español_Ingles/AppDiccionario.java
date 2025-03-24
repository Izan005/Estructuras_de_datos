package org.example.Diccionario_Español_Ingles;

import java.util.Scanner;

public class AppDiccionario {
    static Diccionario diccionario = new Diccionario();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Gato", "Cat");

        cuestionario();
    }

    public static void cuestionario(){

        boolean salir = false;

        while(!salir){
            String palabra = diccionario.palabraAleatoria();
            System.out.println(palabra + ": " + diccionario.primeraLetraTraduccion(palabra) + "...");
            System.out.println("Indique la respuesta:");

            String respuesta = in.next();

            if (respuesta.equalsIgnoreCase(diccionario.traduce(palabra))){
                System.out.println("¡CORRECTO!");
            } else if (respuesta.equalsIgnoreCase("fin")) {
                salir = true;
            } else {
                System.out.println("¡NO! La respuesta correcta era " + diccionario.traduce(palabra));
            }
        }

    }
}
