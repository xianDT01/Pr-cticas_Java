import java.util.Scanner;

public class InvertirPalabra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();


        // Invertir la palabra
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: " + palabraInvertida);
        entrada.close();
    }
}
