import java.util.Scanner;

public class ContarLetrasDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = entrada.nextLine();

        int contadorLetras = 0;
        int contadorDigitos = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                contadorLetras++;
            } else if (Character.isDigit(caracter)) {
                contadorDigitos++;
            }
        }

        System.out.println("La cadena contiene " + contadorLetras + " letras y " + contadorDigitos + " dígitos.");

        entrada.close();
    }
}
