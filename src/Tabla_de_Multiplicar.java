import java.util.Scanner;

public class Tabla_de_Multiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para mostrar su tabla de multiplicar:");
        int numero = entrada.nextInt();

        System.out.println("Tabla de multiplicar del número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        entrada.close();
    }
}
