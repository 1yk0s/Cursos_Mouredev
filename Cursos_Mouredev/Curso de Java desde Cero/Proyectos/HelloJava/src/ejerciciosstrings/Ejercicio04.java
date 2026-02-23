/*
4.- Convierte a mayúsculas y minúsculas un String.
 */

package ejerciciosstrings;

public class Ejercicio04 {
    public static void main(String[] args) {
        String prhase = "Me gustan las patatas";
        String upperPhrase = prhase.toUpperCase();
        String lowerPhrase = prhase.toLowerCase();

        System.out.println("Frase original: ".concat(prhase));
        System.out.println("Frase en mayúsculas: ".concat(upperPhrase));
        System.out.println("Frase en minúsculas: ".concat(lowerPhrase));

    }
}
/*
Solución Mouredev

        // 4. Convierte a mayÃºsculas y minÃºsculas un string.
        String text = "Java es un gran lenguaje";
        System.out.println("Original: " + text);
        System.out.println("MayÃºsculas: " + text.toUpperCase());
        System.out.println("MinÃºsculas: " + text.toLowerCase());
 */