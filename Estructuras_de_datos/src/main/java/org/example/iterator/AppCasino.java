package org.example.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppCasino {
    public static void main(String[] args) {
        ArrayList<Casino> listacasino = new ArrayList<>();
        listacasino.add(new Casino("poker", 12.4));
        listacasino.add(new Casino("blackjack", 12.4));
        listacasino.add(new Casino("21", 12.4));

        Iterator<Casino> it = listacasino.iterator();

        while(it.hasNext()){

            Casino casino = it.next();


            if (casino.getApuesta_minima()>0.20){
                System.out.println("No puedes jugar");
            } else if (casino.getApuesta_minima()<0.20) {
                it.remove();

            }

        }



        System.out.println(listacasino);

        Map<String,String> diccionario = new HashMap<>();
        diccionario.put("Lápiz", "Pencil");
        diccionario.put("Bolígrafo", "Pen");

        for (Map.Entry<String,String> mapa : diccionario.entrySet()){
            System.out.println("Palabra en español: " + mapa.getKey() + " Palabra en inglés: " + mapa.getValue());

        }

        Iterator<Map.Entry<String,String>> iter = diccionario.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<String,String> mapita = iter.next();
            System.out.println("Palabra en español: " + mapita.getKey() + " Palabra en inglés: " + mapita.getValue());
        }




    }

}
