public class Calculando {
    private int n;

    public Calculando(int n) {
        this.n = n;
    }

    public int calcularSumaPares() {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

