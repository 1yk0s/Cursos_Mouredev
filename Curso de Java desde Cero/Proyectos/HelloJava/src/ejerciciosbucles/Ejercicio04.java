/*
04.- Recorre un Array de 5 números e imprime la suma total.
 */

package ejerciciosbucles;

public class Ejercicio04 {
    public static void main(String[] args) {

        int[] numeros = {1, 5, 6, 2, 6};
        int SumaTotal = 0;

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
            SumaTotal += numeros[i];
        }
        System.out.println("Suma total de los números: " + SumaTotal);
    }
}

/*
Solución por Mouredev:

        // 4. Recorre un Array de 5 nÃºmeros e imprime la suma total.
        int[] numbers = { 10, 25, 30, 15, 20 };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("NÃºmero " + (i + 1) + ": " + numbers[i]);
        }
        System.out.println("Suma total: " + sum);
 */
