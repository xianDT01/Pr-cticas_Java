import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();


        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        entrada.close();
    }
}
