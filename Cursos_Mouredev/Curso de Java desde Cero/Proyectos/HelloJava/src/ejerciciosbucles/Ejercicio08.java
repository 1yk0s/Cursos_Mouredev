/*
08.- Usa continue para saltar los múltiplos de 3, del 1 al 20.
 */

package ejerciciosbucles;

public class Ejercicio08 {
    public static void main(String[] args) {
        int numero;
        for(numero = 0; numero <= 20; numero++) {
            if (numero % 3 == 0) {
                System.out.println("Múltiplo de 3");
                continue;
            }
            System.out.println(numero);
        }
    }
}
/*
Solución proporcionada por Mouredev:

        // 8. Usa continue para saltar los mÃºltiplos de 3 del 1 al 20.
        for (int number = 1; number <= 20; number++) {
            if (number % 3 == 0) {
                continue; // Salta los mÃºltiplos de 3
            }
            System.out.println("NÃºmero (no mÃºltiplo de 3): " + number);
 */