/*
7.- Elimina los espacios en blanco al principio y al final del String
 */

package ejerciciosstrings;

public class Ejercicio07 {
    public static void main(String[] args) {
        String phrase = " Estoy practicando Java ";
        String phraseWithoutBlank = phrase.trim();

        System.out.format("\nFrase original: %s", phrase);
        System.out.format("\nFrase sin espacios: %s", phraseWithoutBlank);
    }
}
/*
Solución proporcionada por Mouredev:

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String stringWithSpaces = "   Texto con espacios   ";
        System.out.println("Original: '" + stringWithSpaces + "'");
        System.out.println("Con trim(): '" + stringWithSpaces.trim() + "'");
 */

