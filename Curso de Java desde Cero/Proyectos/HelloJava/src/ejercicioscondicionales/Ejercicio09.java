/*
09.- Crea un programa que diga si una letra es vocal o consonante.
 */
package ejercicioscondicionales;

public class Ejercicio09 {
    public static void main(String[] args) {
        char caracter = 'A';
        char letraMinuscula = Character.toLowerCase(caracter);
        switch (letraMinuscula) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra es vocal");
            break;
            default:
                System.out.println("La letra es consonanante");
        }
    }
}
/*
Solución proporcionada por Mouredev:

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letter = 'a';
        System.out.println("Letra: " + letter);

        // Convertir a minÃºscula para facilitar la comparaciÃ³n
        char lowerLetter = Character.toLowerCase(letter);

        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' ||
                lowerLetter == 'o' || lowerLetter == 'u') {
            System.out.println("La letra '" + letter + "' es una vocal");
        } else if (Character.isLetter(lowerLetter)) {
            System.out.println("La letra '" + letter + "' es una consonante");
        } else {
            System.out.println("'" + letter + "' no es una letra vÃ¡lida");
        }
 */