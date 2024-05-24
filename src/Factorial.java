public class Factorial {
    private int numero;

    // Constructor
    public Factorial(int numero) {
        this.numero = numero;
    }

    public int calcularFactorial() {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
}
