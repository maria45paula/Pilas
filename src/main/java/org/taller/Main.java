package org.taller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pilas pila1 = new Pilas();
        pila1.agregarPila(3);
        int tamanio = pila1.getTamanio();
        System.out.println("El tamanio de la pila es:" + tamanio);
    }
}