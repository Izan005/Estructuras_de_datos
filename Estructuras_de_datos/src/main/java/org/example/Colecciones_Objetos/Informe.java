package org.example.Colecciones_Objetos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Informe {

    static Set<Informe> hashsetInforme = new HashSet<>();
    private int codigo;
    private String descripcion;
    private Tipo tipo;

    public Informe(int codigo, String descripcion, Tipo tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        hashsetInforme.add(this);
    }

    public int getCodigo() {
        return codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }


}
