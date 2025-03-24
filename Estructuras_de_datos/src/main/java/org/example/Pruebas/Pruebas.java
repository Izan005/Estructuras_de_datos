package org.example.Pruebas;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pruebas {
    public static void main(String[] args) {

        Paciente Raul = new Paciente("123456", "Raúl", "García Delgado");
        Paciente Xavi = new Paciente("789012", "Javier", "Cervera Lillo");
        Paciente Javi = new Paciente("789012", "Javier", "Cervera Lillo");
        LinkedHashSet<Paciente> listaPaciente = new LinkedHashSet<>();

        listaPaciente.add(Raul);
        listaPaciente.add(Xavi);
        listaPaciente.add(Javi);
        Xavi.equals(Javi);


        System.out.println(Xavi.hashCode());
        System.out.println(Javi.hashCode());

        System.out.println(listaPaciente);

    }
}
