import java.util.Scanner;

public class Fibonacci {
    public int fibo;

    public Fibonacci(int fibo) {
        this.fibo = fibo;
    }
    public void fibonacci() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite el numero de elementos");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;

        System.out.println("Serie de Fibonacci hasta el término " + n + ":");
        System.out.print(a + " " + b + " ");

        while (i <= n - 2) {
            int fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
            i++;
        }

    }
}
