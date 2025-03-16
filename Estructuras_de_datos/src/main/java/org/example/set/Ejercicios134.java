package org.example.set;

import java.util.*;

public class Ejercicios134 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio1(){
        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine().toLowerCase();
        String vector[] = frase.split(" ");

        Set<String> hashset = new HashSet<>();

        for (int i = 0; i < vector.length; i++) {
            hashset.add(vector[i]);
        }

        System.out.println("Palabras únicas: " + hashset);
    }

    public static void ejercicio3(){
        Set<String> historial = new LinkedHashSet<>();

        String web = "";
        boolean salir = false;
        while(!salir){
            System.out.println("Escriba una URL visitada (o 'salir' para terminar): ");
            web = entrada.next();
            if (web.equals("salir")){
                salir = true;
            } else {
                historial.add(web);
            }

        }

        int cont = 1;
        System.out.println("Historial de navegación:");
        for (String url : historial){
            System.out.println(cont + ". " + url);
            cont++;
        }
    }

    public static void ejercicio4(){
        Set<Integer> lista1 = new TreeSet<>();
        Set<Integer> lista2 = new TreeSet<>();
        Set<Integer> lista3 = new TreeSet<>();

        lista1.add(2);
        lista1.add(10);
        lista1.add(1);
        lista1.add(234);

        System.out.println("Lista 1: " + lista1);

        lista2.add(98);
        lista2.add(12);
        lista2.add(123);
        lista2.add(0);

        System.out.println("Lista 2: " + lista2);

        for (Integer num : lista1){
            lista3.add(num);
        }

        for (Integer num : lista2){
            lista3.add(num);
        }

        System.out.println("Lista ordenada: " + lista3);
    }


}
