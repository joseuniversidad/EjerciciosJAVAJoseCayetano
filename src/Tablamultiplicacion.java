public class Tablamultiplicacion {
    private int number;

    // Constructor
    public Tablamultiplicacion(int number) {
        this.number = number;
    }

    // Método para mostrar la tabla de multiplicar
    public void mostrarTabla() {
        System.out.println("Tabla de multiplicar del número " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = number * i;
            System.out.println(number + " x " + i + " = " + resultado);
        }
    }

    // Método para obtener el valor del número
    public int getNumero() {
        return number;
    }

    // Método para establecer el valor del número
    public void setNumero(int number) {
        this.number = number;
    }
}

