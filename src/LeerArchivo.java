import java.io.*;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Pon el archivo que quieras encontrar");
        String ruta = entrada.nextLine();
        System.out.println("Pon la palabra que quieras encontrar");
        String palabra = entrada.nextLine();
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null){
                if(linea.contains(palabra)){
                    encontrado=true;
                }

            }
            if(encontrado == true){
                System.out.println("Se a encontrado la palabra: " + palabra);
            }else System.out.println("No se encontro la palabra: " + palabra);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
