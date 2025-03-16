package org.example.problemas_acepta_el_reto;

import java.util.*;

public class ParentesisBalanceados {
    static java.util.Scanner in;

    //Está mal
    public static void casoDePrueba() {

        Stack<String> pila = new Stack<>();
        in.next();
        String texto = in.nextLine();
        String vector[] = texto.split("");

        for (int i = 0; i < vector.length; i++) {

            if (vector[i].equals(")") || vector[i].equals("]") || vector[i].equals("}") || vector[i].equals("(") ||
                    vector[i].equals("[") || vector[i].equals("{")) {
                pila.push(vector[i]);
            }
        }

        int cont = 0;
        while(!pila.isEmpty()){
            cont++;
            pila.pop();
        }

        if (cont % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    } // casoDePrueba

    public static boolean balanceado(Stack<String> pila){
        if(pila.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}


