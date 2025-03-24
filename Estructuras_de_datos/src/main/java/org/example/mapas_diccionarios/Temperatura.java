package org.example.mapas_diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Temperatura {
    static Scanner entrada = new Scanner(System.in);
    private Map<String, Integer> mapa;

    public Temperatura (){
        mapa = new HashMap<>();
    }

    public void insertar(String ciudad, Integer temp){
        mapa.put(ciudad, temp);
    }

    public void actualizarTemperatura(String ciudad){

        System.out.println("Inserta una temperatura para " + ciudad + ":");
        int temp = entrada.nextInt();

        mapa.put(ciudad, temp);

    }

    public void consultarTemperatura(){
        System.out.println("Introduce la ciudad a consultar:");
        String ciudad = entrada.next();

        if (mapa.containsKey(ciudad)){
            System.out.println("La temperatura de " + ciudad + " es de " + mapa.get(ciudad) + "º.");
        } else {
            System.out.println("La ciudad " + ciudad + " no tiene temperatura registrada.");
        }
    }

    public void mostrar(){
        for (String ciudad : mapa.keySet()){
            System.out.println(ciudad + ": " + mapa.get(ciudad) + "º");
        }
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "mapa=" + mapa +
                '}';
    }
}
