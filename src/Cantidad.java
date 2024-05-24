public class Cantidad {
    private int cantidad;

    public Cantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void Mostrar() {
        int i = 1;
        while (i <= cantidad) {
            System.out.print(i + " ");
            i++;
        }
    }
    public int getNumero() {
        return cantidad;
    }

    // Método setter para actualizar el número
    public void setNumero(int nuevoNumero) {
        cantidad = nuevoNumero;
    }
}
