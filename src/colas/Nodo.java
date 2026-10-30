package colas;

/**
 * Autor: Yaneli Sanchez Cardenas
 * Fecha: 30/octubre/2026
 * Descripcion: nodo generico que guarda un dato y una referencia al siguiente nodo
 * @param <T> tipo de dato que guarda el nodo
 */
public class Nodo<T> {

    /** dato que guarda el nodo. */
    T dato;

    /** referencia al siguiente nodo de la cola. */
    Nodo<T> siguiente;

    /**
     * crea un nodo con el dato indicado.
     * @param dato valor que guardara el nodo
     */
    Nodo(T dato) {
        this.dato = dato;
    }
}