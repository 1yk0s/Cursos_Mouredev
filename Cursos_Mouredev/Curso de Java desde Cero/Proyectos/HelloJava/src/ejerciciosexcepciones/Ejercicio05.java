/*
05.- Escribe un programa con bloque finally que se ejecute siempre,
     haya o no error.
 */

package ejerciciosexcepciones;

public class Ejercicio05 {
    public static void main(String[] args) {

        String cadena = "1234";
        String cadena2 = "Esto es una cadena no un número";

        try {
            System.out.println("--- CONVERTIR TEXTO A NÚMERO ---");
            textoNumero(cadena);
            textoNumero(cadena2);

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir cadena: " + e.getMessage());
        } finally {
            System.out.println("Funcione o no, yo estoy siempre");
        }
    }

    public static void textoNumero(String texto) {
        Integer numero = Integer.parseInt(texto);
        System.out.println(numero);
    }
}

/*
Solución por Mouredev:

       // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o
        // no error.
        try {
            int division = 10 / 2;
            System.out.println("DivisiÃ³n exitosa: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error en la divisiÃ³n");
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
        }

 */