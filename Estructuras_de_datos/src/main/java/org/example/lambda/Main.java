package org.example.lambda;

public class Main {

    public static void main(String[] args) {
        Pruebas pruebas = new Pruebas() {
            @Override
            public String prueba(String texto) {
                System.out.println("El pepe " + texto);
                return texto.toUpperCase();
            }
        };
        Pruebas lambda = (texto) ->
        {System.out.println("Desde la lambda " + texto);
        return texto.toUpperCase();};

        String resultado_anonima = pruebas.prueba("fkekf");
        String resultado_lambda = lambda.prueba("pfrfjr");
        System.out.println(resultado_lambda);
        System.out.println(resultado_anonima);
    }

}

