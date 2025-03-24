package org.example.Colecciones_Objetos;

import java.util.Objects;

public class Peticion {

    private String id;
    private String nombre;


    public Peticion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peticion peticion = (Peticion) o;
        return Objects.equals(id, peticion.id) && Objects.equals(nombre, peticion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }




}
