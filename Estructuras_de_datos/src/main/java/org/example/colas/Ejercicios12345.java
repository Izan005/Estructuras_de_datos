package org.example.colas;

import java.util.*;

public class Ejercicios12345 {

    static Scanner entrada = new Scanner(System.in);
    static Deque<String> listaCompra = new LinkedList<>();
    public static void main(String[] args) {

        ejercicio4();
    }

    public static void ejercicio3(){
        Queue<String> playlist = new LinkedList<>();

        playlist.offer("DragonBall Rap 1.5");
        playlist.offer("DragonBall Super Rap");
        playlist.offer("DragonBall GT Rap");

        System.out.println("Estado inicial " + playlist);
        System.out.println("Reproduciendo: " + playlist.poll());


    }

    public static void ejercicio4(){

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");

        System.out.println("Seleccione una opción");
        System.out.println();
        System.out.println("------------------------------");
        int opc = entrada.nextInt();

        switch(opc){
            case 1: lista1(opc); break;
//            case 2: lista2(opc); break;
//            case 3: lista3(opc); break;
//            case 4: lista4(opc); break;
//            case 5: lista5(opc); break;
//            case 6: lista6(opc); break;
        }
    }

    public static void lista1(int opcion){

    }

    public static void ejercicio5(){

        Deque<String> cola_doble = new LinkedList<>();

        System.out.println("Introduce una palabra");
        String palabra[] = entrada.next().split("");

        for (int i = 0; i < palabra.length; i++) {
            cola_doble.offer(palabra[i]);
        }

        boolean palindromo = true;
        while(!cola_doble.isEmpty()){
            if (cola_doble.size() != 1){
                if (!cola_doble.pollFirst().equals(cola_doble.pollLast())){
                    palindromo = false;
                    break;
                }
            } else {
                break;
            }
        }

        if(palindromo){
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
