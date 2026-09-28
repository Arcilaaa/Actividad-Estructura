package org.example.collecciones;

import java.util.LinkedList;

public class SistemaTurnos {
    public static void main(String[] args) {
        LinkedList<String> colaBanco = new LinkedList<>();

        // Clientes normales
        colaBanco.addLast("Juan");
        colaBanco.addLast("Maria");

        // Cliente urgente (inserta al inicio)
        colaBanco.addFirst("Pedro (Urgente)");

        // Atender al primero
        String atendido = colaBanco.pollFirst();
        System.out.println("Atendiendo a: " + atendido);
    }
}