class VerificadorNumero {
    private int numero;

    // Constructor que toma el número ingresado por el usuario
    public VerificadorNumero(int numero) {
        this.numero = numero;
    }

    // Método para verificar si el número es positivo, negativo o cero
    public void verificar() {
        if (numero > 0) {
            System.out.println("El número ingresado es POSITIVO.");
            System.out.println("\n");
        } else if (numero < 0) {
            System.out.println("El número ingresado es NEGATIVO.");
            System.out.println("\n");
        } else {
            System.out.println("El número ingresado es CERO.");
            System.out.println("\n");
        }
    }
}
