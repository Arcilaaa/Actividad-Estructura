package org.example.genéricos;

public class MostrarElemento {

    // Método genérico que recibe cualquier tipo de dato T y lo imprime
    public static <T> void mostrarElemento(T elemento) {
        System.out.println("El elemento es: " + elemento);
    }

    public static void main(String[] args) {
        mostrarElemento("Hola Mundo"); // Funciona con Texto
        mostrarElemento(100);          // Funciona con Números
        mostrarElemento(true);         // Funciona con Booleanos
    }
}