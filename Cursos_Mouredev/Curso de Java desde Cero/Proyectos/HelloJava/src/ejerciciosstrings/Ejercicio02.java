/*
Muestra la longitud de una cadena de texto
 */

package ejerciciosstrings;

public class Ejercicio02 {
    public static void main(String[] args) {
        String name = "Kevin";
        int longitud = name.length();

        System.out.println("La longitud de la cadena ".concat(name) + " es: " + longitud);
    }
}
/*
Solución Mouredev:

// 2. Muestra la longitud de una cadena de texto.
        String message = "Hola, Java!";
        System.out.println("La cadena '" + message + "' tiene " + message.length() + " caracteres");
 */