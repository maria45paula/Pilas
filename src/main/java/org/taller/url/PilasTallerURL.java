package org.taller.url;

public class PilasTallerURL {

    Nodo1 top;
    int tamanio;

    public void visit_page(String pagina) {
        Nodo1 nuevo = new Nodo1(pagina);
        if (top == null) {
            top = nuevo;
        } else {
            nuevo.siguiente = top;
            top = nuevo;
        }
    }

    public void back() {
        if (top.siguiente == null) {
            System.out.println("No hay páginas en el historial a las que volver");
        } else {
            String pagina = top.valor;
            top = top.siguiente;
            System.out.println(" Retrocediendo... Ahora estás en: " + top.valor);
        }
    }

    public void current_page() {
        System.out.println("Ahora mismo estas en:" + top.valor);
    }


}
