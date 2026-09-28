package org.example.collecciones;

import java.util.TreeSet;

public class EstudiantesOrdenados {
    public static void main(String[] args) {
        // TreeSet ordena automáticamente las cadenas
        TreeSet<String> estudiantes = new TreeSet<>();
        estudiantes.add("Sofia");
        estudiantes.add("Alberto");
        estudiantes.add("Beatriz");

        System.out.println("Primer estudiante: " + estudiantes.first());
        System.out.println("Último estudiante: " + estudiantes.last());
    }
}