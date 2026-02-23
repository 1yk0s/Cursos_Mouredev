/*
05.- Verifica si un número está en el rango del 1 al 100.
 */

package ejercicioscondicionales;

public class Ejercicio05 {
    public static void main(String[] args) {
        int numero = -7;
        System.out.println("Verifica si el número (" + numero + ") está entre 1 y 100");
        if ((numero >= 1 || numero <= 100) && numero > 0) {
            System.out.println("El número está entre 1 y 100");
        } else if ((numero < 1 || numero > 100) && numero >= 0) {
            System.out.println("El número es menor que 1 o mayor que 100");
        } else {
            System.out.println("Eso no es un número positivo");
        }
    }
}
/*
Solución proporcionada por Mouredev:

        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.
        int rangeNumber = 75;
        System.out.println("NÃºmero: " + rangeNumber);

        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println("El nÃºmero " + rangeNumber + " estÃ¡ en el rango de 1 a 100");
        } else {
            System.out.println("El nÃºmero " + rangeNumber + " NO estÃ¡ en el rango de 1 a 100");
        }
 */