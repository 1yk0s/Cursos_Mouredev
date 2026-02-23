/*
03.- Crea una variable String nula e intenta imprimir su longitud.
     Maneja el NullPointerException.
 */
package ejerciciosexcepciones;

public class Ejercicio03 {
    public static void main(String[] args) {
        String cadena = null;
        try {
            System.out.println("Longitud de la variable: " + cadena.length());
        } catch (NullPointerException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

/*
Solución por Mouredev:

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
        // NullPointerException.
        String text = null;

        try {
            System.out.println("Longitud del texto: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La variable de texto es nula");
        }
 */
