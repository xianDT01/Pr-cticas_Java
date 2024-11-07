import java.util.Scanner;

public class SumaHastaN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = entrada.nextInt();

        int suma = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                suma += i;
            }
            System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
        } else {
            System.out.println("Por favor, introduce un número positivo.");
        }
        entrada.close();
    }
}
