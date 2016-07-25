import java.io.*;
import java.util.Scanner;

/**
 * Esta clase
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 21/07/2016
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido!\nIngrese el nombre del archivo:\n(EL ARCHIVO DEBE DE ESTAR EN LA MISMA CARPETA QUE ESTE EJECUTABLE)");
        String source;

        try
        {
            //ingreso de archivo
            source = ingreso.nextLine();
            BufferedReader datos = new BufferedReader(new FileReader(source));  // Abre documento para su lectura
            String operacion = datos.readLine();  // Lee la unica linea y la guarda como string
            datos.close();  // Se finaliza el lector


            Calculadora calculadora = new Calculadora();

            System.out.println("\nEl resultado de \"" + operacion + "\" es:");
            System.out.println(calculadora.operar(operacion));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Archivo no valido!!!");
        }
    }
}
