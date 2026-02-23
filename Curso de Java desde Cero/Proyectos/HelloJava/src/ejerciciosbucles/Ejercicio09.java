/*
09.- Usa break para detener un bucle cuando encuentres un número negativo en un Array
 */

package ejerciciosbucles;

public class Ejercicio09 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 6, 5, 7, -1, 9, 13, 5};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("El número es negativo \n Se para");
                break;
            }
            System.out.println(numeros[i]);
        }
    }
}
/*
Solución proporcionada por Mouredev:

        // 9. Usa break para detener un bucle cuando encuentres un nÃºmero negativo en un
        // array.
        int[] mixedNumbers = { 5, 12, 8, -3, 15, 20 };

        for (int i = 0; i < mixedNumbers.length; i++) {
            System.out.println("Verificando nÃºmero: " + mixedNumbers[i]);
            if (mixedNumbers[i] < 0) {
                System.out.println("Â¡NÃºmero negativo encontrado: " + mixedNumbers[i] + "!");
                System.out.println("Deteniendo el bucle...");
                break;
            }
        }

 */
