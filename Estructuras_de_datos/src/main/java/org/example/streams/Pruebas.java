package org.example.streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Pruebas {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.of(1,2,3,4,5);
        List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,100,200,100));

        List<Integer> filtrados = listaNumeros.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .collect(Collectors.toList());

        long filtrados2 = listaNumeros.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(filtrados2);

        List<String> listaPalabras = new ArrayList<>(Arrays.asList("Elche", "San Vicente", "Mutxamel", "Eliana"));

        listaPalabras.stream()
                .map(String::toUpperCase)
                .filter(pueblo -> pueblo.contains("I"))
                .filter(pueblo -> pueblo.endsWith("A"))
                .sorted()
                .forEach(System.out::println);


    }
}
