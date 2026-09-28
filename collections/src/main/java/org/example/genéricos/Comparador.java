package org.example.genéricos;

public class Comparador<T extends Comparable<T>> {

    // Método que recibe dos elementos y devuelve el mayor de ellos
    public T mayor(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Comparador<Integer> comparadorNumeros = new Comparador<>();
        System.out.println("El mayor es: " + comparadorNumeros.mayor(10, 25));

        Comparador<String> comparadorTexto = new Comparador<>();
        System.out.println("El mayor es: " + comparadorTexto.mayor("Manzana", "Mandarina"));
    }
}
