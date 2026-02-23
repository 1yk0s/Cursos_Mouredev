/*
8.- Sustituye todos los espacios en blanco de un String por un guión (-).
 */

package ejerciciosstrings;

public class Ejercicio08 {
    public static void main(String[] args) {
        String phrase = "Estoy practicando Java";
        String modifiedPhrase = phrase.replace(" ", "-");
        System.out.println("Frase original: ".concat(phrase));
        System.out.println("Frase modificada: ".concat(modifiedPhrase));

    }
}
/*
Solución proporcionada por Mouredev:

        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).
        String textWithSpaces = "Esto es una frase con espacios";
        String textWithHyphens = textWithSpaces.replace(" ", "-");
        System.out.println("Original: " + textWithSpaces);
        System.out.println("Con guiones: " + textWithHyphens);
 */