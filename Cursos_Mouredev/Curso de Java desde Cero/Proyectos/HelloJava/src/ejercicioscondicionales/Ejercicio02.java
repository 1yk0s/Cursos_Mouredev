/*
02.- Declara dos números y muestra cuál es mayor o si son iguales.
 */

package ejercicioscondicionales;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;

        if (numero1 > numero2) {
            System.out.println("El número 1: " + numero1 + " es mayor que el número 2: " + numero2);
        } else if(numero1 < numero2) {
            System.out.println("El número 1: " + numero1 + " es menor que el número 2: " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("El número 1: " + numero1 + " es igual que el número 2: " + numero2);
        } else {
            System.out.println("El número 1: " + numero1 + " no es ni menor ni mayor ni igual que" +
                    " el número 2: " + numero2);
        }
    }
}
/*
Solución proporcionada por Mouredev:
        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.
        int firstNumber = 25;
        int secondNumber = 18;
        System.out.println("Primer nÃºmero: " + firstNumber);
        System.out.println("Segundo nÃºmero: " + secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("El primer nÃºmero (" + firstNumber + ") es mayor");
        } else if (firstNumber < secondNumber) {
            System.out.println("El segundo nÃºmero (" + secondNumber + ") es mayor");
        } else {
            System.out.println("Ambos nÃºmeros son iguales");

 */