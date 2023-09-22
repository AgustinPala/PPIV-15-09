package ar.edu.undef.fie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapa {
    public static void main(String[] args) {

        var mapa = new HashMap<String, List<String>>();

        var edya = new ArrayList<String>();
        edya.add("Fernando");
        edya.add("Miguel");

        mapa.put("Estructura de datos y algoritmos", edya);

        var paradigmas6 = new ArrayList<String>();
        paradigmas6.add("Curellich");
        paradigmas6.add("Palacios");

        mapa.put("Paradigmas", paradigmas6);

        mapa.get("Paradigmas");
    }
}
