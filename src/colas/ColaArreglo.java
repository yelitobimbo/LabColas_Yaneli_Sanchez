package colas;

/**
 * Autor: Yaneli Sanchez Cardenas
 * Fecha: 30/octubre/2026
 * Descripcion: Cola (FIFO) implementada con un arreglo circular.
 * Tiene capacidad fija: los indices "dan la vuelta" con el operador modulo.
 */
public class ColaArreglo {

    /** Arreglo donde se guardan los elementos. */
    private int[] datos;

    /** Posicion del primer elemento (de aqui se desencola). */
    private int frente;

    /** Posicion del ultimo elemento (aqui se encola). */
    private int fin;

    /** Cantidad de elementos que hay actualmente en la cola. */
    private int tamanio;

    /** Numero maximo de elementos que cabe en la cola. */
    private int capacidad;

    /**
     * Crea una cola vacia con la capacidad indicada.
     * @param capacidad numero maximo de elementos
     */
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }

    /**
     * Indica si la cola no tiene elementos.
     * @return true si esta vacia
     */
    public boolean estaVacia() {
        return tamanio == 0;
    }

    /**
     * Indica si la cola alcanzo su capacidad maxima.
     * @return true si esta llena
     */
    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    /**
     * Devuelve cuantos elementos hay en la cola.
     * @return cantidad de elementos
     */
    public int tamanio() {
        return tamanio;
    }

    /**
     * Agrega un elemento al final de la cola.
     * @param valor numero que se va a encolar
     * @throws IllegalStateException si la cola esta llena
     */
    public void encolar(int valor) {
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena");
        }
        fin = (fin + 1) % capacidad; // avance circular
        datos[fin] = valor;
        tamanio++;
    }


     /**
     * Elimina y devuelve el elemento del frente de la cola.
     * @return el elemento que estaba al frente
     * @throws IllegalStateException si la cola esta vacia
     */
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = datos[frente];
        frente = (frente + 1) % capacidad; // avance circular
        tamanio--;
        return valor;
    }

    /**
     * Consulta el elemento del frente sin eliminarlo.
     * @return el elemento que esta al frente
     * @throws IllegalStateException si la cola esta vacia
     */
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return datos[frente];
    }
}