package org.example.mapas_diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Va_de_modas {
    static Scanner in;

    public static boolean casoDePrueba() {

        int num = in.nextInt();
        if (num == 0){
            return false;
        } else {
            Map<String, Integer> mapa = new HashMap<>();

            in.nextLine();
            String[] numeros = new String[num];

            numeros = in.nextLine().split(" ");

            for (String nums : numeros){
                if (mapa.containsKey(nums)) {
                    mapa.put(nums, mapa.get(nums) + 1);
                } else {
                    mapa.put(nums, 1);
                }
            }
            String n = numeros[0];
            for (Map.Entry<String, Integer> numero : mapa.entrySet()){

                if (mapa.get(n) < numero.getValue()){
                    n = numero.getKey();
                }
            }
            System.out.println(n);
            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main
}
