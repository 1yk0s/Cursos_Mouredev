/*
07.- Elimina uno de los elementos del HashSet.
 */

package ejerciciosestructurasdedatos;

import java.util.HashSet;

public class Ejercicio07 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<String>();
        System.out.println("Tamaño del HashSet: " + nombres.size());
        System.out.println("Se añaden elementos");
        nombres.add("Kevin");
        nombres.add("Vicky");
        nombres.add("Panda");
        System.out.println("Tamaño del HashSet: " + nombres.size());
        System.out.println("Se eliminan elementos");
        nombres.remove("Panda");
        System.out.println("Contenido del HashSet: " + nombres);
        System.out.println("Tamaño del HashSet: " + nombres.size());
    }
}
/*
Solución proporcionada por Mouredev:

        colors.remove("azul");
        System.out.println("HashSet despuÃ©s de eliminar 'azul': " + colors);
        System.out.println("TamaÃ±o: " + colors.size());
 */