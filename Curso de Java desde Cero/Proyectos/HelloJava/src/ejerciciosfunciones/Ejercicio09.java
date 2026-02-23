/*
09.- Escribe un método que reciba un número y retorna su factorial.
    El factorial n o n factorial se define como el producto de todos los números
    enteros positivos desde 1 (es decir, los números naturales) hasta n.
    Ejemplo: 5! = 1 * 2 * 3 * 4 * 5 = 120.
 */

package ejerciciosfunciones;

public class Ejercicio09 {
    public static void main(String[] args) {
        int numero = 5;
        int numFactorial = numeroFactorial(numero);
        System.out.println("El factorial del número " + numero + " es: " + numFactorial);

    }
    public static int numeroFactorial(int numero) {
        int factorial = 1;
        for(int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
/*
Solución por Mouredev:
        // 9. Escribe un mÃ©todo que reciba un nÃºmero y retorna su factorial.
        int factorialResult = calculateFactorial(5);
        System.out.println("El factorial de 5 es: " + factorialResult);
        System.out.println("El factorial de 6 es: " + calculateFactorial(6));

            // 9. FunciÃ³n que calcula el factorial de un nÃºmero
        public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
 */
