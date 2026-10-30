package colas;

/**
 * Autor: Yaneli Sanchez Cardenas
 * Fecha: 30/octubre/2026
 * Descripcion: Prueba de los ejercicios de refuerzo imprimirCola y vaciar
 */
public class PruebaRefuerzo {
    public static void main(String[] args) {
        ColaEnlazada<String> cola = new ColaEnlazada<>();
        cola.encolar("Ana");
        cola.encolar("Luis");
        cola.encolar("María");

        System.out.println("--- imprimirCola ---");
        cola.imprimirCola();
        System.out.println("Tamaño: " + cola.tamanio()); // sigue siendo 3

        System.out.println("--- vaciar ---");
        cola.vaciar();
        System.out.println("¿Vacía? " + cola.estaVacia()); // true
        System.out.println("Tamaño: " + cola.tamanio());   // 0
        cola.imprimirCola();
    }
}