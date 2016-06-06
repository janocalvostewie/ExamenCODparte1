package examenfinalparte1;

public class Principal {

    /**
     * Atributo de la clase tipo integer. Se le ha puesto private para que
     * no se pueda acceder a él desde fuera de la clase
     */
    private int i;

    /**
     * Primer constructor de esta clase. Necesita dos parámetros
     *
     * @param j Primer parámetro para la construcción de la clase
     * @param m Segundo parámetro para la construcción de la clase
     */
    public Principal(int j, int m) {
        i = sumar(j, m);
    }

    /**
     * Segundo constructor de esta clase. Necesita dos parámetros
     *
     * @param j Primer parámetro para la construcción de la clase
     */
    public Principal(int j) {
        i = sumar(j, j);
    }

    /**
     * Tercer constructor de la clase que no recibe parámetros
     */
    public Principal() {
        i = -1;
    }

    /**
     * Método que suma las dos variables que se pasan como parámetros
     *
     * @param x variable integer que se sumará
     * @param x1 variable integer que se sumará
     * @return
     */
    public int sumar(int x, int x1) {
        return x + x1;
    }

    /**
     * Imprime por pantalla el valor del atributo
     */
    public void imprimirValor() {
        System.out.println("El valor es: " + i);
    }
}
