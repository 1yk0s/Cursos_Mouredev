/*
02.- Crea un Array de tres elementos e intenta acceder al índice 5.
     Captura el ArrayIndexOutBoundsException.
 */

package ejerciciosexcepciones;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] elementos = {3, 5, 7};
        try {
            System.out.println(elementos[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Solución por Mouredev:

        // 2. Crea un array de 3 elementos e intenta acceder al Ã­ndice 5. Captura el
        // ArrayIndexOutOfBoundsException.
        int[] numbers = { 1, 2, 3 };

        try {
            System.out.println("Elemento en Ã­ndice 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Ãndice fuera del rango del array");
        }
 */