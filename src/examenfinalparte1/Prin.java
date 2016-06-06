package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        /**
         * Instanciamos un objeto de la clase Principal
         */
        Principal obj = new Principal(10, 20);
        obj.imprimirValor();
        /**
         * Instanciamos un segundo objeto de la clase Principal
         */
        Principal obj2 = new Principal(10);
        obj2.imprimirValor();
        /**
         * Instanciamos un tercer objeto de la clase Principal
         */
        Principal obj3 = new Principal();
        obj3.imprimirValor();
    }
}
