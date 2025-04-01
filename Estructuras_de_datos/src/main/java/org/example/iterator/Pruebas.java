package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Pruebas {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(2, 45, 23, 100));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){
            Integer num = it.next();

            if (num==23){
                it.remove();
            }

            System.out.println(num);
        }

        System.out.println(numeros);

    }
}
