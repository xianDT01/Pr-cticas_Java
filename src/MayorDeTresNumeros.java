import java.util.Scanner;

public class MayorDeTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = entrada.nextInt();

        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);

        entrada.close();
    }
}
