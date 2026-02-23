/*
06.- Usa throw para lanzar un IllegalArgumentException si un número introducido
     es negativo.

 */

package ejerciciosexcepciones;

public class Ejercicio06 {
    public static void main(String[] args) {
        int numero = 31;
        int numeroNegativo = -31;

        try {
            System.out.println("--- ERROR SI ES NÚMERO NEGATIVO --- ");
            insertNumber(numero);
            insertNumber(numeroNegativo);
        } catch (Exception e ) {
            System.out.println("Tipo de excepción: " + e.getClass());
        }
    }

    public static void insertNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}
/*
Solución por Mouredev:

        // 6. Usa throw para lanzar un IllegalArgumentException si un nÃºmero introducido
        // es negativo.
        try {
            checkPositiveNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            checkPositiveNumber(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

            // 6. FunciÃ³n que valida nÃºmeros positivos
    public static void checkPositiveNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("El nÃºmero debe ser positivo");
        } else {
            System.out.println("NÃºmero vÃ¡lido: " + number);
        }
    }

 */