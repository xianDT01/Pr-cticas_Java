import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Introduce un número entero positivo: ");
        int numero = entrada.nextInt();

        int suma = 0;


        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);

        entrada.close();
    }
}
