import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = entrada.nextInt();

        long factorial = 1;

        // Calcular el factorial
        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        } else {
            System.out.println("Por favor, introduce un número positivo.");
        }

        entrada.close();
    }
}
