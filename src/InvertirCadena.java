import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = entrada.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("La cadena invertida es: " + textoInvertido);

        entrada.close();
    }
}
