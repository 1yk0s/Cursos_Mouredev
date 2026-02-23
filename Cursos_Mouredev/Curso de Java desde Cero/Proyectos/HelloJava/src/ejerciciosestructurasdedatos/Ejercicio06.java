/*
06.- Añade un valor repetido y otro sin repetir al HashSet.
 */

package ejerciciosestructurasdedatos;

import java.util.HashSet;

public class Ejercicio06 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<String>();
        System.out.println("Tamaño del HashSet: " + nombres.size());
        nombres.add("Kevin");
        nombres.add("Vicky");
        System.out.println("Contenido del HashSet: " + nombres);
        //Se añade elemento repetido.
        nombres.add("Vicky");
        //Se añade elemento sin repetir
        nombres.add("Karma");
        System.out.println("Tamaño del HashSet: " + nombres.size());
        System.out.println("Contenido del HashSet: " + nombres);
    }

}
/*
Solución porporcionada por Mouredev:

        // 6. AÃ±ade un nuevo valor repetido y otro sin repetir al HashSet.
        colors.add("rojo"); // Valor repetido: no se aÃ±adirÃ¡
        colors.add("verde"); // Valor nuevo: sÃ­ se aÃ±adirÃ¡
        System.out.println("HashSet despuÃ©s de intentar aÃ±adir 'rojo' (repetido) y 'verde' (nuevo): " + colors);
        System.out.println("TamaÃ±o: " + colors.size());
 */