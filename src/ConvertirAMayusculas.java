import java.util.Scanner;

public class ConvertirAMayusculas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();

        String palabraMayusculas = palabra.toUpperCase();

        System.out.println("La palabra en mayúsculas es: " + palabraMayusculas);

        entrada.close();
    }
}
