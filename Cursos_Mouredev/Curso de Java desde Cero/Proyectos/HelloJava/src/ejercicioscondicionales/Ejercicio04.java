/*
04.- Crea un programa que diga si un número es par o impar
 */

package ejercicioscondicionales;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero = 6;
        System.out.println("Verifica si el número: (" + numero + ") es par o impar");
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else if (numero % 2 != 0) {
            System.out.println("El número es impar");
        }

    }
}
/*
Solución por Mouredev:
        // 4. Crea un programa que diga si un nÃºmero es par o impar.
        int numberToCheck = 7;
        System.out.println("NÃºmero a verificar: " + numberToCheck);

        if (numberToCheck % 2 == 0) {
            System.out.println("El nÃºmero " + numberToCheck + " es par");
        } else {
            System.out.println("El nÃºmero " + numberToCheck + " es impar");
        }


 */