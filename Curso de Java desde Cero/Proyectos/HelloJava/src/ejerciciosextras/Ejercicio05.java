/*
05.- usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
 */

package ejerciciosextras;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- INTRODUCE UN NÚMERO ---");
        var numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println("El número es negativo: " + numero);
        } else if (numero <= 0 && numero > 0){
            System.out.println("Eso no es un número");
        } else {
            System.out.println("El número es positivo: " + numero);
        }
    }
}
/*
Solución por Mouredev:
        // 5. Usa import java.util.Scanner; para leer un nÃºmero y mostrar si es positivo
        // o negativo.
        System.out.print("Introduce un nÃºmero: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("El nÃºmero " + number + " es positivo");
        } else if (number < 0) {
            System.out.println("El nÃºmero " + number + " es negativo");
        } else {
            System.out.println("El nÃºmero es cero");
        }
 */