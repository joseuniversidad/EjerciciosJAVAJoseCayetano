public class NumeroIn {
    private int numero1;

    public NumeroIn(int numero) {
        this.numero1 = numero;
    }

    public void Numeroingresadoo() {
        System.out.println("Números desde 1 hasta " + numero1+ ":");
        for (int i = 1; i <= numero1; i++) {
            System.out.print(i + " ");
        }
    }

    public int getNumero() {
        return numero1;
    }

    public void setNumero(int numero) {
        this.numero1 = numero;
    }
}

