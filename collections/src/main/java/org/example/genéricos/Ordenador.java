package org.example.genéricos;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Ordenador<T extends Comparable<T>> {

    // Método que ordena cualquier lista de elementos comparables
    public void ordenar(List<T> lista) {
        Collections.sort(lista);
    }

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");

        Ordenador<String> ordenador = new Ordenador<>();
        ordenador.ordenar(nombres);

        System.out.println(nombres);
    }
}