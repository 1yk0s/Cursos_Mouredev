/*
04.- Escribe una función que transforma texto a número.
     Usa try-catch para manejar entradas no válidas (NumberFormatException).
 */

package ejerciciosexcepciones;

public class Ejercicio04 {
    public static void main(String[] args) {
        String texto = "1234";

        try {
            System.out.println("Convertir de texto a número");
            textoNumero(texto);
        } catch (NumberFormatException e) {
            System.out.println("No se ha podido convertir: " + e.getMessage());
        }

    }

    public static void textoNumero(String texto) {
        Integer numero = Integer.parseInt(texto);
        System.out.println("Número correspondiente al texto: " + numero);
    }
}

/*
Solución por Mouredev:

        // 4. Escribe una funciÃ³n que transforma texto a nÃºmero. Usa try-catch para
        // manejar entradas no vÃ¡lidas (NumberFormatException).
        System.out.println(convertToNumber("123"));
        System.out.println(convertToNumber("abc"));

            // 4. FunciÃ³n para convertir texto a nÃºmero
    public static String convertToNumber(String text) {
        try {
            int number = Integer.parseInt(text);
            return "NÃºmero convertido: " + number;
        } catch (NumberFormatException e) {
            return "Error: No se puede convertir '" + text + "' a nÃºmero";
        }
    }
 */