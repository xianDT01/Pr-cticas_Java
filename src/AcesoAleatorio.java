import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AcesoAleatorio {
    public static void main(String[] args) {
        String fileName = "registros.log";

        try (RandomAccessFile logFile = new RandomAccessFile(fileName, "rw");
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Menú:");
                System.out.println("1) Agregar un Registro");
                System.out.println("2) Salir");
                System.out.print("Elija una opción: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    System.out.print("Ingrese un registro de evento: ");
                    String evento = scanner.nextLine();

                    // Mover el puntero al final del archivo
                    logFile.seek(logFile.length());

                    // Agregar el evento al archivo de log
                    logFile.writeUTF(evento + "\n");
                    System.out.println("Registro agregado correctamente.");
                } else if (choice == 2) {
                    System.out.println("Saliendo del programa.");
                    break;
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}