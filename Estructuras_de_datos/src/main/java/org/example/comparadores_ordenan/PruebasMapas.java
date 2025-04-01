package org.example.comparadores_ordenan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebasMapas {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1234, "Izan");
        mapa.put(2321, "Pol");
        mapa.put(4567, "Marrón Michael Bowen Coito I");

        List<Map.Entry<Integer, String>> listaMapa = new ArrayList<>(mapa.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, String> listaMapa2 : listaMapa){
            System.out.println(listaMapa2.getKey() + ", " + listaMapa2.getValue());
        }
    }
}
