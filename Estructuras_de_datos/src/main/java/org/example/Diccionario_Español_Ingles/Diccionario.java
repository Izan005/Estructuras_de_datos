package org.example.Diccionario_Español_Ingles;

import java.util.*;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario(){
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String español, String ingles){
        diccionario.put(español, ingles);
    }

    public String traduce(String español){
        return diccionario.get(español);
    }

    public String palabraAleatoria(){
        Random rdm = new Random();

        int pos_rdm = rdm.nextInt(0, diccionario.size())
                ;
        int cont = 0;
        String palabra = "";

        for (Map.Entry<String, String> mapa : diccionario.entrySet()){
            if (cont == pos_rdm){
                palabra = mapa.getKey();
            }
            cont++;
        }
        return palabra;
    }

    public String primeraLetraTraduccion(String español){
        String[] vector = diccionario.get(español).split("");
        return vector[0];
    }
}
