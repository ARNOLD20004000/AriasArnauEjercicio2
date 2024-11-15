// Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        // Variables necesarias al inicio del programa
        // Patrón para las casillas
        char pattern;
        int size;
        final int MAX_SIZE = 15;
        final int MIN_SIZE = 1;

        // Creamos un escáner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Solicitar el patrón al usuario
        System.out.print("Introduce un carácter para el patrón del tablero: ");
        pattern = input.next().charAt(0); // Obtenemos el primer carácter introducido

        // Solicitar el tamaño de las casillas
        System.out.print("Introduce el tamaño de las casillas (entre " + MIN_SIZE + " y " + MAX_SIZE + "): ");

        // Validar que el tamaño es un entero y está en el rango correcto
        if (input.hasNextInt()) {
            size = input.nextInt();
            if (size < MIN_SIZE || size > MAX_SIZE) {
                System.out.println("Error: el tamaño debe estar entre " + MIN_SIZE + " y " + MAX_SIZE + ".");
                // Finalizamos el programa si el tamaño no es válido
                return;
            }
        } else {
            System.out.println("Error: debes introducir un número entero válido.");
            // Finalizamos el programa si la entrada no es un entero
            return;
        }

        // Generar el tablero
        for (int row = 0; row < 8; row++) {
            // El tablero tiene 8 filas
            for (int cellRow = 0; cellRow < size; cellRow++) {
                // Repetimos para el tamaño de la casilla
                for (int col = 0; col < 8; col++) {
                    // El tablero tiene 8 columnas
                    for (int cellCol = 0; cellCol < size; cellCol++) {
                        // Repetimos para el tamaño de la casilla
                        // Determinamos si el cuadrado es "negro" o "blanco"
                        if ((row + col) % 2 == 0) {
                            System.out.print(pattern); // Cuadrado negro (usa el patrón)
                        } else {
                            System.out.print(" "); // Cuadrado blanco (espacio vacío)
                        }
                    }
                }
                // Nueva línea para completar la fila de casillas
                System.out.println();
            }
        }

        // Cerramos el escáner para evitar fugas de recursos
        input.close();

        System.out.println("Tablero generado con éxito.");
    }
}