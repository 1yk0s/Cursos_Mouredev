/*
Muestra el primer y el último caracter de un String.
 */

package ejerciciosstrings;

public class Ejercicio03 {
    public static void main(String[] args) {
        String name = "Kevin";
        String primerCaracter = name.substring(0, 1);
        int lastCharacter = (name.length() - 1);
        String ultimoCaracter = name.substring(lastCharacter);
        System.out.println("El primer caracter del String ".concat(name) + " es: ".concat(primerCaracter));
        System.out.println("El último caracter del String ".concat(name) + " es: ".concat(ultimoCaracter));

    }
}

/*
Solución por Mouredev:

        // 3. Muestra el primer y Ãºltimo carÃ¡cter de un string.
        String word = "ProgramaciÃ³n";
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        System.out.println("Primer carÃ¡cter de '" + word + "': " + firstChar);
        System.out.println("Ãšltimo carÃ¡cter de '" + word + "': " + lastChar);

 */
