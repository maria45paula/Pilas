package org.taller.FIFO;

public class Main {

    public static void main(String[] args) {
        Pila fila = new Pila();

        // 1. Insertamos elementos
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);

        System.out.print("Pila inicial: ");
        fila.imprimirLista();

        System.out.println("\nDesencolando uno... (Sale el " + fila.dequeue() + ")");

        System.out.print("Pila resultante: ");
        fila.imprimirLista();

        System.out.println("\nSiguiente en salir (front): " + fila.front());
        System.out.println("Cantidad de elementos: " + fila.size());
    }
}

