import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ingresado;
        do {

            Scanner opc = new Scanner(System.in);
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("=====================================================================================================================");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                  DIGITE UN NUMERO ENTRE 1-12 QUE TE GUSTARIA EJECUTAR                                           ||");
            System.out.println("||                  1- PROGRAMA PARA SABER SI ES POSITIVO O NEGATIVO                                               ||");
            System.out.println("||                  2- PROGRAMA PARA IDENTIFICAR SI EL NUMERO ES PAR O IMPAR                                       ||");
            System.out.println("||                  3- PROGRAMA DE CUAL NUMERO ES MAYOR                                                            ||");
            System.out.println("||                  4- AÑO INGRESADO BISIESTO O NO                                                                 ||");
            System.out.println("||                  5- IMPRIMIR NUMERO PARES WHILE                                                                 ||");
            System.out.println("||                  6- MOSTRAR NUMEROS HASTA NUMERO INGRESADO                                                      ||");
            System.out.println("||                  7- POSITIVOS NEGATIVOS                                                                         ||");
            System.out.println("||                  8- FIBONACCI                                                                                   ||");
            System.out.println("||                  9- NUMERO PARES                                                                                ||");
            System.out.println("||                 10- TABLA DE MULTIPLICAR                                                                        ||");
            System.out.println("||                 11- ENTERO POSITIVO HATA N                                                                      ||");
            System.out.println("||                 12- FACTORIAL                                                                                   ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("=====================================================================================================================");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            ingresado = opc.nextInt();
            switch (ingresado) {

                //PROGRAMA PARA SABER SI ES POSITIVO O NEGATIVO
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Ingresa un número: ");
                    int numeroIngresado = scanner.nextInt();

                    VerificadorNumero verificador = new VerificadorNumero(numeroIngresado);
                    verificador.verificar();
                    break;

                //PROGRAMA PARA IDENTIFICAR SI EL NUMERO ES PAR O IMPAR
                case 2:
                    Scanner identificar = new Scanner(System.in);
                    System.out.println("Ingresa un numero:");
                    int numeroIdentificado = identificar.nextInt();

                    Par par = new Par(numeroIdentificado);
                    par.parImpar();
                    break;

                //PROGRAMA DE CUAL NUMERO ES MAYOR
                case 3:
                    Scanner mayor1 = new Scanner(System.in);
                    System.out.print("Ingresa el primer número: ");
                    int numero1 = mayor1.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int numero2 = mayor1.nextInt();
                    System.out.print("Ingresa el tercer número: ");
                    int numero3 = mayor1.nextInt();

                    Numeromayor comparador = new Numeromayor(numero1, numero2, numero3);
                    int Mayor = comparador.encontrarMaximo();

                    System.out.println("El número máximo es: " + Mayor);
                    System.out.println("\n");
                    break;

                //AÑO INGRESADO BISIESTO O NO
                case 4:

                    Scanner biss = new Scanner(System.in);
                    System.out.println("Ingresa un año para identificar si es Bisiesto o no");
                    int bissieano = biss.nextInt();

                    Bisiesto bisiesto = new Bisiesto(bissieano);
                    boolean verBisiesto = bisiesto.verBisiesto();

                    if (verBisiesto) {
                        System.out.println(bissieano + " es un año bisiesto.");
                        System.out.println("\n");

                    } else {
                        System.out.println(bissieano + " no es un año bisiesto.");
                        System.out.println("\n");
                    }
                    break;

                // IMPRIMIR NUMERO PARES WHILE
                case 5:
                    Ascendente mostrar = new Ascendente(1, 20);

                    //IMPRIMIR NUMERO HASTA N CANTIDAD
                    Scanner id = new Scanner(System.in);
                    System.out.println("Ingresa un numero:");
                    int numero = id.nextInt();

                    Cantidad cantidad = new Cantidad(numero);
                    cantidad.Mostrar();
                    break;

                //
                case 6:
                    Scanner procesador = new Scanner(System.in);
                    System.out.print("Ingresa un número: ");
                    int receive =procesador.nextInt();

                    NumeroIn computadora = new NumeroIn(receive);
                    computadora.Numeroingresadoo();

                break;
               //POSITIVO NEGATIVO
                case 7:
                    Positivonegativo suma = new Positivonegativo();
                    suma.sumando();
                    break;
                //FIBONACCI
                case 8:
                   Fibonacci fibonacci = new Fibonacci(2);
                    fibonacci.fibonacci();
                    break;

                //NUMERO PARES
                case 9:
                    Numerospares numerospares = new Numerospares();
                    numerospares.MostrarPares();
                    break;
                //TABLA DE MULTIPLICAR
                case 10:
                    Scanner receive1 = new Scanner(System.in);
                    System.out.print("Ingresa un número: ");
                    int Leer2 = receive1.nextInt();

                    Tablamultiplicacion tabla = new Tablamultiplicacion( Leer2);
                    tabla.mostrarTabla();

                    break;

                 // ENTERO POSITIVO
                case 11:
                    Scanner ide = new Scanner(System.in);
                    System.out.print("Ingresa un número entero positivo: ");
                    int identi = ide.nextInt();

                    Calculando sumaPares = new Calculando(identi);
                    int resultado = sumaPares.calcularSumaPares();
                    System.out.println("La suma de los números pares desde 1 hasta " + ide + " es: " + resultado);
                    break;

                  // FACTORIAL
                    case 12:
                        Scanner scanneru = new Scanner(System.in);
                        System.out.print("Ingresa un número entero positivo: ");
                        int ultimo = scanneru.nextInt();

                        Factorial calculadora = new Factorial(ultimo);
                        int view = calculadora.calcularFactorial();

                        System.out.println("El factorial de " + ultimo + " es: " + view);

                        break;
                default:
                    System.out.println("EL NUMERO NO ESTA EN EL RANGO INDICADO, VUELVE A INTENTARLO");


            }


        } while (ingresado != 0);
    }
}




