import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double numero3 = entrada.nextDouble();

        // Calcular promedio dos tres numeros
        double promedio = (numero1 + numero2 + numero3) / 3;


        System.out.println("El promedio de los tres números es: " + promedio);

        entrada.close();
    }
}
