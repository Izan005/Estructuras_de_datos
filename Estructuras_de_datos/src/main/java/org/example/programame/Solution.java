package org.example.programame;

import java.sql.SQLOutput;
import java.util.*;

// Asume fichero llamado solution.java
public class Solution { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ

        String[] nums = in.nextLine().split(" ");
        Integer[] numerines = new Integer[nums.length];
        for (int i = 0; i < numerines.length; i++) {
            numerines[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numerines);

        int mcm = 1;

        for (int i = numerines[0]; i < 0; i--) {

            if (numerines[0] % i == 0 && numerines[1] % i == 0 && numerines[2] % i == 0) {

                if (i != 1) {
                    mcm = i;

                }

            }

        }

        System.out.println(mcm);




    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution