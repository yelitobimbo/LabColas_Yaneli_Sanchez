package colas;

/**
 * Autor: Yaneli Sanchez Cardenas
 * Fecha: 30/octubre/2026
 * Descripcion: cola fifo implementada con nodos enlazados
 * no tiene limite de capacidad, usa genericos para guardar cualquier tipo de dato
 * @param <T> tipo de dato que guarda la cola
 */
public class ColaEnlazada<T> {

    /** primer nodo de la cola (de aqui se desencola). */
    private Nodo<T> frente;

   /** ultimo nodo de la cola (aqui se encola). */
    private Nodo<T> fin;

    /** cantidad de elementos que hay actualmente en la cola. */
    private int tamanio;

    /**
     * Indica si la cola no tiene elementos.
     * @return true si esta vacia
     */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
     * devuelve cuantos elementos hay en la cola.
     * @return cantidad de elementos
     */
    public int tamanio() {
        return tamanio;
    }
     /**
     * agrega un elemento al final de la cola.
     * @param valor dato que se va a encolar
     */
    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }
      /**
     * Elimina y devuelve el elemento del frente de la cola.
     * @return el dato que estaba al frente
     * @throws IllegalStateException si la cola esta vacia
     */
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedo vacia
        }
        tamanio--;
        return valor;
    }

    /**
     * consulta el elemento del frente sin eliminarlo.
     * @return el dato que esta al frente
     * @throws IllegalStateException si la cola esta vacia
     */
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }
      /**
     * Muestra todos los elementos de la cola, del frente al final,
     * sin eliminarlos.
     */
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    /**
     * Deja la cola sin elementos.
     */
    public void vaciar() {
        frente = null;
        fin = null;
        tamanio = 0;
    }
}