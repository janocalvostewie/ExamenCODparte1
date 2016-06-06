package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal obj = new Principal(10, 20);
        int numero = obj.i;
        System.out.println("Es: " + numero);
        Principal obj2 = new Principal(10);
        int numero2 = obj2.i;
        System.out.println("Es: " + numero2);
        Principal obj3 = new Principal();
        int numero3 = obj3.i;
        System.out.println("Es: " + numero3);
    }
}
