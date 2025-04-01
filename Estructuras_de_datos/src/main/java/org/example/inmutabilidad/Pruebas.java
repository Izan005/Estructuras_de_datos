package org.example.inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Juego pokemon = new Juego("Pokemon Plata", 100);

        List<String> listaPokemon = pokemon.getListaPersonajes();
        listaPokemon.add("Pikachu");

        pokemon.getListaPersonajes().add("Squirtle");
        pokemon.getListaPersonajes().add("Charmander");

        System.out.println(pokemon.getListaPersonajes());
        System.out.println(listaPokemon);

    }
}
