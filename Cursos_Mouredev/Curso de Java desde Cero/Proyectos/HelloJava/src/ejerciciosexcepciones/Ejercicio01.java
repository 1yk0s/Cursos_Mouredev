/*
01.- Divide dos números almacenados en dos variables.
     Maneja la división por cero con try-catch.
 */

package ejerciciosexcepciones;

public class Ejercicio01 {
    public static void main(String[] args) {

        int numero1 = 12;
        int numero2 = 0;
        try {
            numero1 = numero1 / numero2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Solución por Mouredev:

        // 1. Divide dos nÃºmeros almacenados en dos variables. Maneja la divisiÃ³n por
        // cero con try-catch.
        int number1 = 10;
        int number2 = 0;

        try {
            int result = number1 / number2;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }

 */