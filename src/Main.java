import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase principal que maneja la entrada del usuario y muestra el resultado del cálculo de cambio.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Lee una cantidad del usuario, la procesa en el cajero y muestra el cambio resultante.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.print("Introduce la cantidad: ");
        Scanner scanner = new Scanner(System.in);

        Cajero banamex = new Cajero();
        banamex.setCantidad(scanner.nextInt());


        int[] cambio = banamex.darCambio();
        System.out.println(Arrays.toString(cambio)); // Mantiene la salida del arreglo
        banamex.mostrarCambio(cambio);
        ;


    }
}