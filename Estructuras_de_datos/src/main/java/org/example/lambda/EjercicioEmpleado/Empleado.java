package org.example.lambda.EjercicioEmpleado;

import lombok.Getter;

@Getter
public class Empleado {
    private String nombre;
    private Double salario;
    private String fecha;

    public Empleado(String nombre, Double salario, String fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }
}
