package org.taller.LIFO;

public class Pilas {
    Nodo top;
    int tamanio;

    public void agregarPila(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (top == null) {
            top = nuevo;
        } else {
            nuevo.siguiente = top;
            top = nuevo;
        }
        tamanio++;

    }

    public int peek() {
        return top.valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacia");
        }

        int dato = top.valor;
        top = top.siguiente;

        tamanio--;
        return dato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void imprimirLista() {
        if (this.top != null) {
            Nodo puntero = top;
            while (puntero != null) {
                System.out.println(puntero.valor);
                puntero = puntero.siguiente;
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public boolean isEmpty() {
        return tamanio == 0;
    }

}
