package org.example.comparadores_ordenan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(3,2,45,23,1));

        Collections.sort(lista);
        System.out.println(lista);

        List<String> lista2 = new ArrayList<>(Arrays.asList("Patri", "Pol", "Izan", "Andy"));

        Collections.sort(lista2);
        System.out.println(lista2);

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan", 1));
        listaProductos.add(new Producto("Arroz", 2));
        listaProductos.add(new Producto("Arroz", 6));

        Collections.sort(listaProductos, new CompararPorPrecio());
        System.out.println(listaProductos);
        System.out.println();
    }
}
