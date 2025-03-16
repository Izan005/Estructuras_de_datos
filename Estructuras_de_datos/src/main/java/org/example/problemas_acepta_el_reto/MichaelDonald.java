package org.example.problemas_acepta_el_reto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MichaelDonald {

    static Scanner in;
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)

            casoDePrueba();
    }

    public static void casoDePrueba(){

        boolean repetidos = false;
        in.next();
        String vector[] = in.nextLine().trim().split(" ");
        Set<String> set = new HashSet<>();

        for(int i = 0; i < vector.length; i++){

            String parte[] = vector[i].split("/");
            String cumple = parte[0] + "/" + parte[1];
            if (set.contains(cumple)){
                repetidos = true;
                break;
            } else {
                set.add(cumple);
            }
        }

        if (repetidos){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
