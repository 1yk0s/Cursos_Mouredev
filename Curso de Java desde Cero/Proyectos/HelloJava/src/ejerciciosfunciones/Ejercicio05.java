/*
05.- Escribe una función que reciba un número y diga si es par o impar
 */

package ejerciciosfunciones;

public class Ejercicio05 {
    public static void main(String[] args) {
        boolean resultado = parOImpar(4);
        boolean resultado2 = parOImpar(5);

    }
    public static boolean parOImpar(int num) {
        if(num % 2 == 0) {
            System.out.println("El número " + num + " es par");
            return true;
        }
        System.out.println("El número " + num + " es impar");
        return false;
    }
}

/*
Solución por Mouredev:

        // 5. Escribe una funciÃ³n que reciba un nÃºmero y diga si es par o impar.
        checkEvenOrOdd(4);
        checkEvenOrOdd(7);
        checkEvenOrOdd(12);


            // 5. FunciÃ³n que verifica si un nÃºmero es par o impar
        public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("El nÃºmero " + number + " es par");
        } else {
            System.out.println("El nÃºmero " + number + " es impar");
        }
    }
 */