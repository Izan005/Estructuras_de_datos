package org.example.mapas_diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> notas = new LinkedHashMap<>();

        notas.put("Adrián", 3);
        notas.put("Raúl", 4);
        notas.put("Manuel", 7);
        System.out.println("Nota para Raúl: " + notas.get("Raúl"));

        System.out.println(notas.remove("Manuel"));
        System.out.println(notas.keySet());

        if (notas.containsKey("Adrián")){
            System.out.println("Adrián existe");
        }

        if (notas.containsValue(10)){
            System.out.println("Alguien tiene un 10");
        }

        //Bucle para imprimir la clave del mapa
        for (String clave : notas.keySet()){
            System.out.println(clave);
        }

        //Bucle para imprimir el valor del mapa
        for (Integer valor : notas.values()){
            System.out.println(valor);
        }

        //Interfaz para imprimir la clave y el valor del mapa
        for (Map.Entry<String, Integer> mapaNotas : notas.entrySet()){
            System.out.println(mapaNotas);
        }
    }
}
