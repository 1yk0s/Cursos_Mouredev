/*
07.- Implementa una función que reciba una cadena y retorne su longitud.
 */

package ejerciciosfunciones;

public class Ejercicio07 {
    public static void main(String[] args) {
        int longCadena = longitudCadena("Hola");

    }
    public static int longitudCadena(String cadena) {
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena " + cadena + " es: " + longitud);
        return longitud;
    }
}
/*
Solución proporcionada por Mouredev:

        // 7. Implementa una funciÃ³n que reciba una cadena y retorne su longitud.
        String text = "Hola, Java!";
        int length = getStringLength(text);
        System.out.println("La longitud de '" + text + "' es: " + length);
        System.out.println("La longitud de 'Java' es: " + getStringLength("Java"));

            // 7. FunciÃ³n que retorna la longitud de una cadena
        public static int getStringLength(String text) {
        return text.length();
    }
 */
