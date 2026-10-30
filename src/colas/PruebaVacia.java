package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Autor: Yaneli Sanchez Cardenas
 * fecha: 30/octubre/2026
 * Descripcion: compara los metodos de Queue con una cola vacia.
 */
public class PruebaVacia {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        try {
            cola.remove();
        } catch (Exception e) {
            System.out.println("remove(): excepcion " + e.getClass().getSimpleName());
        }

        System.out.println("poll(): " + cola.poll());

        try {
            cola.element();
        } catch (Exception e) {
            System.out.println("element(): excepcion " + e.getClass().getSimpleName());
        }

        System.out.println("peek(): " + cola.peek());
    }
}