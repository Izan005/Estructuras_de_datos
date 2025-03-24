package org.example.mapas_diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicios1234 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio1(){

        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();

        String vector[] = frase.split(" ");
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        for (String palabra : vector){
            mapa.put(palabra,mapa.getOrDefault(palabra, 0)+1);
        }

        for (Map.Entry<String, Integer> palabras : mapa.entrySet()){
            System.out.println(palabras.getKey() + ": " + palabras.getValue());
        }
    }

    public static void ejercicio2(){
        System.out.println("Introduce una palabra:");
        String palabra = entrada.next();
        LinkedHashMap<Character, Integer> mapa = new LinkedHashMap<>();

        for (Character caracter : palabra.toCharArray()){
            mapa.put(caracter,mapa.getOrDefault(caracter, 0)+1);
        }

        for (Map.Entry<Character, Integer> palabras : mapa.entrySet()){
            System.out.println(palabras.getKey() + ": " + palabras.getValue());
        }
    }
}
