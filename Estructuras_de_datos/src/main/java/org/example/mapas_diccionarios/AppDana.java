package org.example.mapas_diccionarios;

import java.util.HashMap;
import java.util.Map;

public class AppDana {
    public static void main(String[] args) {

        Temperatura mapa = new Temperatura();

        mapa.insertar("Alicante", 32);
        mapa.insertar("Valencia", 32);
        System.out.println(mapa);
        mapa.actualizarTemperatura("Alicante");
        System.out.println(mapa);
        mapa.consultarTemperatura();
        mapa.mostrar();
    }


}
