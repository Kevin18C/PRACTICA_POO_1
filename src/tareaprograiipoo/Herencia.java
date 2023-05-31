package tareaprograiipoo;

import java.util.Scanner;

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Calculadora calculadora = new Calculadora("KC");
        boolean salir = false;

        CalculadoraEspecial calculadora1 = new CalculadoraEspecial("KC");
        int opcion;
        double angulo = 30;

        do {
            System.out.println("");
            System.out.println("=======================");
            System.out.println("1.  Sumar");
            System.out.println("2.  Restar");
            System.out.println("3.  Multiplicar");
            System.out.println("4.  Dividir");
            System.out.println("5.  Raiz Cuadrada");
            System.out.println("6.  Verificar numero Primo");
            System.out.println("7.  Factorial");
            System.out.println("8.  Potencia");
            System.out.println("9.  Logaritmo");
            System.out.println("10. Coseno");
            System.out.println("11. Seno");
            System.out.println("12. Tangente");
            System.out.println("13. Salir");
            System.out.println("Selecciona una opcion");
            System.out.println("=======================");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es = " + calculadora1.sumar(10, 5));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es = " + calculadora1.restar(10, 5));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es = " + calculadora1.multiplicar(10, 5));
                    break;
                case 4:
                    System.out.println("El resultado de la division es = " + calculadora1.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " + calculadora1.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " + calculadora1.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado del factorial es = " + calculadora1.factorial(10));
                    break;
                case 8:
                    System.out.println("El resultado de la potencia es = " + calculadora1.potencia(10, 2));
                    break;
                case 9:
                    System.out.println("El resultado del logaritmo es = " + calculadora1.logaritmo(10, 10));
                    break;
                case 10:
                    System.out.println("El resultado del coseno de " + angulo + " grados es =  " + calculadora1.coseno(30));
                    break;
                case 11:
                    System.out.println("El resultado del seno de " + angulo + "grados es = " + calculadora1.seno(30));
                    break;
                case 12:
                    System.out.println("El resultado de la tangente de" + angulo + "grados es = " + calculadora1.tangente(30));
                    break;
                case 13:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 1 y 13");
            }
        } while (!salir);

    }
}