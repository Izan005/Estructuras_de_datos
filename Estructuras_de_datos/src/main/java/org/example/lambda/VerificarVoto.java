package org.example.lambda;

@FunctionalInterface
public interface VerificarVoto {
    boolean puedeVotar(String nombre, int edad);
}
