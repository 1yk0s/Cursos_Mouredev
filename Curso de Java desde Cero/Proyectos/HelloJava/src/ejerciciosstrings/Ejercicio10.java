/*
10.- Comprueba si dos Strings tienen la misma longitud.
 */

package ejerciciosstrings;

public class Ejercicio10 {
    public static void main(String[] args) {
        String phrase1 = "Hola, Java";
        String phrase2 = "Programo en Java";
        String phrase3 = "Java";
        String phrase4 = "Voy a ser desarrollador Java";

        System.out.println("Longitud de la primera frase: " + phrase1.length());
        System.out.println("¿La longitud de la primera frase \"".concat(phrase1).concat("\" Es igual que" +
                "la segunda frase? ".concat(phrase2)));
        System.out.println("phrase1.length() == phrase2.length(): " + (phrase1.length() == phrase2.length()));
    }
}
/*
Solución proporcionada por Mouredev:

        String word1 = "Programar";
        String word2 = "MoureDev";
        String word3 = "Java";

        boolean sameLength1 = word1.length() == word2.length();
        boolean sameLength2 = word1.length() == word3.length();

        System.out.println("'" + word1 + "' y '" + word2 + "' tienen la misma longitud: " + sameLength1);
        System.out.println("'" + word1 + "' y '" + word3 + "' tienen la misma longitud: " + sameLength2);
        System.out.println("Longitud de '" + word1 + "': " + word1.length());
        System.out.println("Longitud de '" + word2 + "': " + word2.length());
        System.out.println("Longitud de '" + word3 + "': " + word3.length());

 */