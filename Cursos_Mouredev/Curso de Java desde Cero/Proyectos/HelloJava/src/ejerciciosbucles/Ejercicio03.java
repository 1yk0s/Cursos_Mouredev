/*
03.- Imprime los múltiplos de 5, del 1 al 50 usando for.
     Un múltiplo es el producto que se obtiene al multiplicar un número por otro.
 */

package ejerciciosbucles;

public class Ejercicio03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i % 5 == 0) {
                System.out.println("Múltiplo de 5: " + i);
            }
        }
    }
}

/*
Solución proporcionada por Mouredev:

        // 3. Imprime los mÃºltiplos de 5 del 1 al 50 usando for.
        for (int number = 1; number <= 50; number++) {
            if (number % 5 == 0) {
                System.out.println("MÃºltiplo de 5: " + number);
            }
        }
 */
