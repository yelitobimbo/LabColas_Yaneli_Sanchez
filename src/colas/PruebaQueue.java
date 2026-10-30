package colas;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * autor: Yaneli Sanchez Cardenas
 * fecha: 30/octubre/2026
 * Descripcion: pruebas con la interfaz Queue de Java
 */
public class PruebaQueue {
    public static void main(String[] args) {
        // Paso 3.1
        Queue<String> cola = new LinkedList<>();
      // Prueba tambien: Queue<String> cola = new ArrayDeque<>();
        cola.offer("Ana");
       cola.offer("Luis");
       cola.offer("María");
       System.out.println(cola.peek()); // Ana (no la elimina)
       System.out.println(cola.poll()); // Ana (la elimina)
        System.out.println(cola.size()); // 2
        System.out.println(cola);        // [Luis, María]

        // Paso 3.3
        System.out.println("--- PriorityQueue ---");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
    }
}