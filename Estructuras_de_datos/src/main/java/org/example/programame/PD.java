package org.example.programame;

import java.util.Arrays;

public class PD { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ
        String[] vector = in.nextLine().split(" ");
        int[] nums = new int[vector.length];
        boolean primo = false;
        boolean orden = false;
        int sumatorio = 0;

        String[] copia = vector;
        Arrays.sort(copia);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(vector[i]);
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2 || nums[i] == 3 || nums[i] == 5 || nums[i] == 7 || nums[i] == 11 || nums[i] == 13 || nums[i] == 19 || nums[i] == 23 || nums[i] == 29 || nums[i] == 31 || nums[i] == 41 || nums[i] == 47 || nums[i] == 43 || nums[i] == 53 || nums[i] == 59 ||
                    nums[i] == 61 || nums[i] == 67 || nums[i] == 71 || nums[i] == 73 || nums[i] == 79 || nums[i] == 83 || nums[i] == 89 || nums[i] == 97){

                primo = true;
            }



            sumatorio += nums[i];
        }

        if (vector.equals(copia)){
            orden = true;
        }

        if (sumatorio < 100 && orden && primo) {
            System.out.println("VALIDO");
        } else  {
            System.out.println("INVALIDO");
        }







    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution
