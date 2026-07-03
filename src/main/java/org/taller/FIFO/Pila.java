package org.taller.FIFO;

public class Pila {
    Nodo2 front;
    Nodo2 back;
    int tamanio;

    public Pila() {
        this.front = null;
        this.back = null;
        this.tamanio = 0;
    }

    public void enqueue(int valor) {
        Nodo2 nuevo = new Nodo2(valor);

        if (isEmpty()) {
            front = nuevo;
            back = nuevo;
        } else {
            back.siguiente = nuevo;
            back = nuevo;
        }
        tamanio++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }

        int valor = front.valor;
        front = front.siguiente;

        if (front == null) {
            back = null;
        }

        tamanio--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return front.valor;
    }

    public int size() {
        return tamanio;
    }

    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return;
        }

        Nodo2 actual = front;
        System.out.print("Frente -> [");

        while (actual != null) {
            System.out.print(actual.valor);
            if (actual.siguiente != null) {
                System.out.print(", ");
            }
            actual = actual.siguiente;
        }

        System.out.println("] <- Final");
    }

    public boolean isEmpty() {
        return front == null;
    }
}