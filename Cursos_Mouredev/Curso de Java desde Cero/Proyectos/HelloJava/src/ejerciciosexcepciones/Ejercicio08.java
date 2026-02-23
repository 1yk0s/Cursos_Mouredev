/*
08.- Crea un programa con varios bloques catch: uno para ArithmeticException,
     otro para ArrayIndexOutBoundsException.
 */

package ejerciciosexcepciones;

public class Ejercicio08 {
    public static void main(String[] args) {
        int[] elementos = {1,2,3,4,5};
        int numero = 10;
        int resultado;

        try {
            resultado = numero / 0;
        } catch (ArithmeticException a ) {
            System.out.println("Error en la división: " + a.getMessage());
        }

        try {
            System.out.println(elementos[5]);
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("El array no es tan largo: " + b.getMessage());
        }
    }
}

/*
Solución por Mouredev:

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
        // otro para ArrayIndexOutOfBoundsException.
        try {
            int[] array = { 1, 2, 3 };
            int result = 10 / 0;
            System.out.println(array[10]);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmÃ©tico: DivisiÃ³n por cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de array: Ãndice fuera de lÃ­mites");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }


 */