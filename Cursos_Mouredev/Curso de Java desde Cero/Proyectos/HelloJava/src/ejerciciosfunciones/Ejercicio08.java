/*
08.- Crea un método que reciba un array de enteros, calcule su media y lo retorna.
 */

package ejerciciosfunciones;

public class Ejercicio08 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mediaMatriz = calculoMedia(numeros);
        System.out.println("La media de los numeros es: " + mediaMatriz);


    }
    public static int calculoMedia(int[] numeros) {
        int sumaTotal = 0;
        for(int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];
        }
        int media = sumaTotal / numeros.length;
        return media;
    }
}
/*
Solución por Mouredev:

        // 8. Crea un mÃ©todo que reciba un array de enteros, calcula su media y lo
        // retorna.
        int[] numbers = { 10, 20, 30, 40, 50 };
        double average = calculateAverage(numbers);
        System.out.println("La media del array es: " + average);

            // 8. FunciÃ³n que calcula la media de un array
        public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
 */