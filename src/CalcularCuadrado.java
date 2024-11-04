import java.util.Scanner;

public class CalcularCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();

        // Calcular el cuadrado del número
        int cuadrado = numero * numero;


        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        entrada.close();
    }
}
