/*
5.- Comprueba si una cadena de texto tiene una palabra concreta.
 */

package ejerciciosstrings;

public class Ejercicio05 {
    public static void main(String[] args) {
        String phrase = "Estoy practicando Java";
        String palabra = "Java";
        System.out.println("¿La frase \"".concat(phrase) + "\" contiene la palabra ".concat(palabra)
                            + " ? " + phrase.contains(palabra));
    }
}

/*
Solución por Mouredev:

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String sentence = "Me gusta programar en Java";
        String searchWord = "Java";
        boolean containsWord = sentence.contains(searchWord);
        System.out.println("Â¿La frase '" + sentence + "' contiene '" + searchWord + "'? " + containsWord);

        // BÃºsqueda sin distinciÃ³n de mayÃºsculas/minÃºsculas
        boolean containsWordIgnoreCase = sentence.toLowerCase().contains(searchWord.toLowerCase());
        System.out.println("Â¿Contiene 'java' (sin distinciÃ³n de mayÃºsculas)? " + containsWordIgnoreCase);
 */