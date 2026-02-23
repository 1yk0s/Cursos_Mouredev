/*
04.- Crea un método que calcule el cuadrado de un número (n * n)
 */

package ejerciciosfunciones;

public class Ejercicio04 {
    public static void main(String[] args) {

        int resultado = cuadradoNumero(5);
    }

    public static int cuadradoNumero(int num1) {
        int operacion = num1 * 2;
        System.out.println("El cuadrado del número " + num1 + " es: " + operacion);
        return operacion;
    }
}

/*
Solución por Mouredev:

        // 4. Crea un mÃ©todo que calcule el cuadrado de un nÃºmero (n * n).
        int square = calculateSquare(5);
        System.out.println("El cuadrado de 5 es: " + square);
        System.out.println("El cuadrado de 7 es: " + calculateSquare(7));

            // 4. FunciÃ³n que calcula el cuadrado de un nÃºmero
        public static int calculateSquare(int number) {
        return number * number;
    }
 */
