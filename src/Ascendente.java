public class Ascendente {
        private int comenzar;
        private int terminar;

        public Ascendente(int comenzar, int terminar) {
            this.comenzar = comenzar;
            this.terminar = terminar;
        }
    public void imprimirAscendente() {
        int numeroA = comenzar;
        while (numeroA <= terminar) {
            System.out.print(numeroA + " ");
            numeroA++;
        }
    }
}

