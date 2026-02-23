/*
02.- Modifica uno de los valores del array e imprime el valor antes y después
    de modificarlo.
 */


package ejerciciosestructurasdedatos;

public class Ejercicio02 {
    public static void main(String[] args) {
        String[] nombres = {"Vicky", "Kevin", "Karma", "Panda", "Nanouk"};
        System.out.println(nombres[2]);
        nombres[2] = "Nanouk";
        System.out.println(nombres[2]);
        System.out.println(java.util.Arrays.toString(nombres));
    }
}

/*
Solución proporcionada por Mouredev:

        // 2. Modifica uno de los valores del Array e imprime el valor del Ã­ndice antes
        // y despuÃ©s de modificarlo.

        System.out.println("\nAntes de modificar:");
        System.out.println("Valor en Ã­ndice 2: " + fruits[2]);

        fruits[2] = "melocotÃ³n";

        System.out.println("DespuÃ©s de modificar:");
        System.out.println("Valor en Ã­ndice 2: " + fruits[2]);
        System.out.println("Array completo: " + java.util.Arrays.toString(fruits));
 */

