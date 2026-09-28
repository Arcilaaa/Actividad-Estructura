package org.example.collecciones;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacturaSupermercado {
    public static void main(String[] args) {
        // Mantiene el orden exacto en que se ingresan los datos
        LinkedHashMap<String, Double> compras = new LinkedHashMap<>();
        compras.put("Leche", 2.50);
        compras.put("Pan", 1.00);
        compras.put("Huevos", 3.20);

        double total = 0;
        for (Map.Entry<String, Double> producto : compras.entrySet()) {
            System.out.println(producto.getKey() + ": $" + producto.getValue());
            total += producto.getValue();
        }

        System.out.println("Total a pagar: $" + total);
    }
}
