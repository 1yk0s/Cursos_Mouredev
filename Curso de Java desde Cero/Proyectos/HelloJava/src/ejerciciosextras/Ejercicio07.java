/*
07.- importa java.util.Random y genera un número aleatorio del 1 al 10.
 */

package ejerciciosextras;
import java.util.Random;

public class Ejercicio07 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(10) + 1);
    }
}
/*
Solución por Mouredev:
        // 7. Importa java.util.Random y genera un nÃºmero aleatorio del 1 al 10.
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Del 1 al 10
        System.out.println("NÃºmero aleatorio generado: " + randomNumber);
 */
