import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = entrada.next().charAt(0);

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        entrada.close();
    }
}
