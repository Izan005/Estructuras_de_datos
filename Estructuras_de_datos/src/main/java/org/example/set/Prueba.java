package org.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

    public static void main(String[] args) {
        Set<Character> letras = new HashSet<>();

        letras.add('a');
        letras.add('y');
        letras.add('b');
        letras.add('a');
        letras.add('h');

        System.out.println(letras);

        System.out.println("----------------");
        Set<Character> letras_enlazadas = new LinkedHashSet<>();

        letras_enlazadas.add('a');
        letras_enlazadas.add('y');
        letras_enlazadas.add('b');
        letras_enlazadas.add('a');
        letras_enlazadas.add('h');

        System.out.println(letras_enlazadas);

        System.out.println("---------------");
        Set<Character> letras_tree = new TreeSet<>();

        letras_tree.add('a');
        letras_tree.add('y');
        letras_tree.add('b');
        letras_tree.add('a');
        letras_tree.add('h');

        System.out.println(letras_tree);
    }
}
