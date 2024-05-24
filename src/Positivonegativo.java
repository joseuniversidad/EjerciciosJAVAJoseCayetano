import java.util.Scanner;

public class Positivonegativo {
    private int sumando;

    public Positivonegativo(){
        sumando = 0;
    }

    public void sumando(){
        Scanner leer = new Scanner(System.in);
        int valor;

        System.out.print("Digite un valor (Si desea parar ingresa un numero negativo)");
        do {
            System.out.println("Digite un numero: ");
            valor = leer.nextInt();
            if (valor > 0){
                sumando+=valor;
            }
        }while (valor>=0);
    }
    public int getSumando(){
        return sumando;
    }
}
