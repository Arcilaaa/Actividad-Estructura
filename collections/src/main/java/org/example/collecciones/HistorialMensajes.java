package org.example.collecciones;

import java.util.ArrayDeque;

public class HistorialMensajes {
    public static void main(String[] args) {
        ArrayDeque<String> historial = new ArrayDeque<>();

        // Se agregan mensajes al final
        historial.addLast("Hola");
        historial.addLast("¿Cómo estás?");
        historial.addLast("Nos vemos luego");

        // Ver el último mensaje enviado
        System.out.println("Último mensaje: " + historial.getLast());
    }
}
