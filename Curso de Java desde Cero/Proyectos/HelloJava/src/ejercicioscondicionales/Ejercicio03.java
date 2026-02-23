/*
03.- Dado un número, verifica si es positivo, negativo o 0.
 */

package ejercicioscondicionales;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero = -2;

        System.out.println("El número es: " + numero);
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
/*
Solución proporcionada por Mouredev
        // 3. Dado un nÃºmero, verifica si es positivo, negativo o cero.
        int number = -5;
        System.out.println("NÃºmero: " + number);

        if (number > 0) {
            System.out.println("El nÃºmero es positivo");
        } else if (number < 0) {
            System.out.println("El nÃºmero es negativo");
        } else {
            System.out.println("El nÃºmero es cero");
        }
 */