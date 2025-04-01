package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class PruebasListIterator {
    public static void main(String[] args) {

        ArrayList<Character> letras = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        ListIterator<Character> it = letras.listIterator();

        while(it.hasNext()){
            System.out.println(it.next() + " ");
            if(letras.get(2) == 'i'){
                it.set('p');
            }
        }

        System.out.println();
        System.out.println("----------------------");


        ListIterator<Character> it_reves = letras.listIterator(letras.size());
        while(it_reves.hasPrevious()){
            System.out.print(it_reves.previous());
        }


    }
}
