package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicios123 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){

        Stack<Character> pila = new Stack<>();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        if (pila.isEmpty()){
            System.out.println("La pila está vacía.");
        } else {
            pila.size();
            pila.peek();
            while(!pila.isEmpty()){
                System.out.println(pila.pop());
            }
        }

    }
    public static void ejercicio2(){

        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el número " + i+1 + ":");
            pila.push(entrada.nextInt());
        }

        System.out.println("Números en orden inverso:");
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }

    }
    public static void ejercicio3(){

        System.out.println("Introduce la cadena:");
        String cadena = entrada.next();
        String vector[] = cadena.split("");
        Stack<String> pila = new Stack<>();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].equals("(")){
                pila.push(vector[i]);

            } else if (vector[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }

        if (esBalanceado(pila)){
            System.out.println("Los paréntesis están bien");
        } else {
            System.out.println("Los paréntesis están mal");
        }

    }

    public static boolean esBalanceado(Stack<String> pila){
        if (pila.isEmpty()){
            return true;
        }
        return false;
    }
}
