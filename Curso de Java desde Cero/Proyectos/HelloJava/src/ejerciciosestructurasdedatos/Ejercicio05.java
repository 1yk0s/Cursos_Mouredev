/*
05.- Crea un HashSet con dos valores diferentes.
 */

package ejerciciosestructurasdedatos;

import java.util.HashSet;

public class Ejercicio05 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<String>();
        System.out.println("Tamaño del HashSet: " + nombres.size());
        nombres.add("Kevin");
        nombres.add("Vicky");
        System.out.println("Contenido del HashSet: " + nombres);
    }

}
/*
Solución proporcionada por Mouredev:

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> colors = new HashSet<>();
        colors.add("rojo");
        colors.add("azul");
        System.out.println("\nHashSet con 2 colores: " + colors);
        System.out.println("TamaÃ±o: " + colors.size());

 */
