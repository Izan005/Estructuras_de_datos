package org.example.Colecciones_Objetos;

import java.util.LinkedHashSet;

public class AppImpresora {
    static final String id = "PC3493";
    static LinkedHashSet<Peticion> lista = new LinkedHashSet<>();

    public static void main(String[] args) {

        añadirDocumento("prueba.pdf");
        añadirDocumento("prueba.pdf");
        añadirDocumento("prueba2.pdf");
        añadirDocumento("prueba.txt");
        imprimirDocumento();
        getNumPeticiones();
        verTodo();
        imprimirTodo();
        System.out.println(lista);
    }

    public static void añadirDocumento(String nombre){

        if (nombre.endsWith(".pdf")){

            if(lista.add(new Peticion(id, nombre))){
                System.out.println("Fichero " + nombre + " ha sido añadido.");
            } else {
                System.out.println("El documento " + nombre + " ya existe. No se creará.");
            }
        } else {
            System.out.println("El archivo no está en formato pdf, por lo que no se creará.");
        }
    }

    public static void imprimirDocumento(){
        System.out.println("Se ha imprimido el fichero " + lista.removeFirst());
    }

    public static void getNumPeticiones(){
        System.out.println("Peticiones totales en cola: " + lista.size());
    }

    public static void verTodo(){
        System.out.println("Peticiones en cola: " + lista);
    }

    public static void imprimirTodo(){

        System.out.println("=== Imprimiedo peticiones en cola ===");
        while (!lista.isEmpty()){
            imprimirDocumento();
        }
    }

}


