package org.example.iterator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Teclado_estropeado {
    static Scanner in;

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {
            String entrada = in.nextLine();

            LinkedList<Character> letras = new LinkedList<>();

            ListIterator<Character> it = letras.listIterator();

            for (char c : entrada.toCharArray()){
                switch (c){
                    case '-':
                        while(it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }

            for (char c : letras){
                System.out.print(c);
            }
            System.out.println();

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main
}
