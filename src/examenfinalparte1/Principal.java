package examenfinalparte1;

public class Principal {

    int i;

    public Principal(int j, int m) {
        i = sumar(j, m);
    }

    public Principal(int j) {
        i = sumar(j, j);
    }

    public Principal() {
        i = -1;
    }

    /**
     * Método que suma las dos variables que se pasan como parámetros
     * @param x variable integer que se sumará
     * @param x1 variable integer que se sumará
     * @return 
     */
    public int sumar(int x, int x1) {
        return x + x1;
    }
}
