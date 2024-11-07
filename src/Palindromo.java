import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine().toLowerCase();

        // Invertir la palabra
        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        if (palabra.equals(invertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        entrada.close();
    }
}
