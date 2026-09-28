package org.example.collecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaSinDuplicados {
    public static void main(String[] args) {
        // Set no permite duplicados
        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Manzana"); // Se ignora por duplicado

        // Uso de Iterador para recorrer la lista
        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
