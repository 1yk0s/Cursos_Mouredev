/*
6.- Formatea un String con un entero.
 */

package ejerciciosstrings;

public class Ejercicio06 {
    public static void main(String[] args) {
        String name = "Kevin";
        int age = 31;

        System.out.format("Mi nombre es %s y tengo %d años", name, age);
    }
}
/*
Solución por Mouredev:

        // 6. Formatea un string con un entero.
        String name = "Brais";
        int age = 38;
        String formattedMessage = String.format("Hola, me llamo %s y tengo %d aÃ±os", name, age);
        System.out.println(formattedMessage);

        // TambiÃ©n con printf
        System.out.printf("Usando printf: %s tiene %d aÃ±os.%n", name, age);
 */