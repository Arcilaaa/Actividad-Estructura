package org.example.genéricos;

public class Intercambiar {

    // Método que intercambia dos posiciones en un arreglo genérico
    public static <T> void intercambiar(T[] arreglo, int pos1, int pos2) {
        T temporal = arreglo[pos1];
        arreglo[pos1] = arreglo[pos2];
        arreglo[pos2] = temporal;
    }

    public static void main(String[] args) {
        String[] palabras = {"Uno", "Dos"};
        intercambiar(palabras, 0, 1);
        System.out.println(palabras[0] + " - " + palabras[1]); // Salida: Dos - Uno
    }
}
