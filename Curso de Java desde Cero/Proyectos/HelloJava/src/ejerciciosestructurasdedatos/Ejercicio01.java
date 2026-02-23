/*
01.- Crea un Array de cinco valores e imprime su longitud.
 */

package ejerciciosestructurasdedatos;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Declaración e inicialización
        String[] nombres = new String[5];

        //Añadir datos
        nombres[0] = "Kevin";
        nombres[1] = "Alonso";
        nombres[2] = "Morán";
        nombres[3] = "Vicky";
        nombres[4] = "Marcos";

        System.out.println(nombres);
        System.out.println(nombres.length);

    }
}

/*
Solución de Mouredev:

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] fruits = { "manzana", "plÃ¡tano", "naranja", "uva", "pera" };
        System.out.println("Array de frutas: " + java.util.Arrays.toString(fruits));
        System.out.println("Longitud del array: " + fruits.length);
 */