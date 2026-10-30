package colas;

public class Main {
    public static void main(String[] args) {
        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
       cola.encolar(20);
       cola.encolar(30);
       System.out.println("Sale: " + cola.desencolar());
       cola.encolar(40);
       System.out.println("Frente: " + cola.frente());
        System.out.println("Tamaño: " + cola.tamanio());
        System.out.println("¿Llena? " + cola.estaLlena());

    System.out.println("--- Parte 2: ColaEnlazada ---");
       ColaEnlazada<String> nombres = new ColaEnlazada<>();
       nombres.encolar("Ana");
       nombres.encolar("Luis");
       nombres.encolar("María");
        System.out.println(nombres.desencolar());
        System.out.println(nombres.frente());
        System.out.println(nombres.tamanio());
    }
}