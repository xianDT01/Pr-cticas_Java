import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();

        // Obtener la longitud de la palabra
        int longitud = palabra.length();

        System.out.println("La palabra tiene " + longitud + " caracteres.");

        entrada.close();
    }
}
