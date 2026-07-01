package org.taller.LIFO;

public class Main {
    public static void main(String[] args) {
        Pilas pila1 = new Pilas();
        pila1.agregarPila(3);
        pila1.agregarPila(5);
        int valorEliminado = pila1.pop();
        System.out.println("Valor Eliminado:" + valorEliminado);
        int tamanio = pila1.getTamanio();
        System.out.println("El tamanio de la pila es:" + tamanio);
        pila1.imprimirLista();
    }
}