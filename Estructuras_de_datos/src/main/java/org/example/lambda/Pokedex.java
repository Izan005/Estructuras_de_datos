package org.example.lambda;

import lombok.Getter;

@Getter
public class Pokedex {
    private String pokemon;
    private Integer entrenadores;

    public Pokedex (String pokemon, int entrenadores){
        this.entrenadores = entrenadores;
        this.pokemon = pokemon;
    }


}
