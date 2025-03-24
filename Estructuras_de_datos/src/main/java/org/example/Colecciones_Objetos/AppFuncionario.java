package org.example.Colecciones_Objetos;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class AppFuncionario {
    static Stack<Informe> pilaInformes = new Stack<>();

    public static void main(String[] args) {

        Informe inf1 = new Informe(123, "Informe 1", Tipo.PERSONAL);
        Informe inf2 = new Informe(456, "Informe 2", Tipo.ADMINISTRATIVO);
        Informe inf3 = new Informe(789, "Informe 3", Tipo.EMPRESARIAL);
        Informe inf4 = new Informe(012, "Informe 4", Tipo.PERSONAL);
        Informe inf5 = new Informe(123, "Informe 5", Tipo.ADMINISTRATIVO);

        pilaInformes.push(inf1);
        pilaInformes.push(inf2);
        pilaInformes.push(inf3);
        pilaInformes.push(inf4);
        pilaInformes.push(inf5);

        mostrarSet();
        despachar();

        pilaInformes.push(inf1);
        pilaInformes.push(inf2);
        pilaInformes.push(inf3);

        ordenSalida();



        System.out.println(pilaInformes);
    }

    public static void despachar(){
        while(!pilaInformes.isEmpty()){
            if (Informe.hashsetInforme.contains(pilaInformes.peek())){
                Informe.hashsetInforme.remove(pilaInformes.peek());
            }
            System.out.println("Despachando informe: " + pilaInformes.pop());
        }
        System.out.println("Todos los informes han sido despachados.");
    }

    public static void ordenSalida(){
        while(!pilaInformes.isEmpty()){
            if (Informe.hashsetInforme.contains(pilaInformes.peek())){
                Informe.hashsetInforme.remove(pilaInformes.peek());
            }
            System.out.println("Informe que sale ahora: " + pilaInformes.pop());
        }
    }

    public static void mostrarSet(){
        for (Informe i : Informe.hashsetInforme){
            System.out.println("Informe: " + i);
        }
    }



}

