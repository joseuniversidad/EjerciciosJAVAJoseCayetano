public class Numerospares {
    private int start;
    private int end;

    // Constructor
    public Numerospares() {
        start = 2;
        end = 20;
    }

    // Método para imprimir los números pares
    public void MostrarPares() {
        System.out.println("Números pares del " + start + " al " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}


