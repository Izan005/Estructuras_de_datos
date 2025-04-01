package org.example.iterator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Mecanografia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce una palabra:");
        String palabra = in.next();

        LinkedList<Character> listaPalabra = new LinkedList<>();

        ListIterator<Character> it = listaPalabra.listIterator();

        for (char c : palabra.toCharArray()){

            switch(c){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(c);
                    break;
            }
        }

        System.out.print("Salida: ");
        for (char c : listaPalabra){
            System.out.print(c);
        }



        }

    }

