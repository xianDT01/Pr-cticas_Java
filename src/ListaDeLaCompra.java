import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Añadir un producto a la lista");
            System.out.println("2. Terminar y mostrar la lista");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el producto que quieres agregar:");
                        String producto = entrada.nextLine();
                        lista.add(producto);
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opción inválida. Introduce 1 o 2.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: introduce un número válido.");
                entrada.nextLine();
            }
        }

        System.out.println("Los productos a comprar son:");
        for (String item : lista) {
            System.out.println(item);
        }

        entrada.close();
    }
}

