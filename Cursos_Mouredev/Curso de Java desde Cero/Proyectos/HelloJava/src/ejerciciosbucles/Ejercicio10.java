/*
10.- Crea un programa que calcule el factorial de un número dado.
    El factorial de un número es igual al producto de todos los números enteros positivos
    desde 1 hasta dicho número.
    Es la multiplicación de todos los números positivos enterios anteriores a él
    incluyendo dicho número.
 */

package ejerciciosbucles;

public class Ejercicio10 {
    public static void main(String[] args) {
        int nFactorial = 4;
        int numeroAnterior = 0;
        int factorial = 1;

        for (int i = 1; i <= nFactorial; i++) {
            System.out.println("Número anterior: " + i);
            numeroAnterior = i;
            factorial *= numeroAnterior;

        }
        System.out.println("El factorial de " + nFactorial + " es: " + factorial);
    }
}
/*
Solución proporcionada por Mouredev:

// 10. Crea un programa que calcule el factorial de un nÃºmero dado.
        int numberForFactorial = 5;
        long factorial = 1;

        System.out.println("Calculando el factorial de " + numberForFactorial + ":");
        for (int i = 1; i <= numberForFactorial; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }
        System.out.println("El factorial de " + numberForFactorial + " es: " + factorial);
 */