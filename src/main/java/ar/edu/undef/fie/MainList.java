package ar.edu.undef.fie;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {

        // PROGRAMAR SOBRE INTERFAZ! NO SOBRE IMPLEMENTACIONES
        // List lista = new LinkedList

        var lista = new ArrayList<String>();
        // var lista = new LinkedList<String>();    // Cuando elimina, reasigna los punteros

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");

        lista.remove(1);
        lista.remove(4);
    }
}
