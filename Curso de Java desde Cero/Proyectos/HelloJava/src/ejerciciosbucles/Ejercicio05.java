/*
05.- Usa un for para recorrer un Array y mostrar sus valores.
 */

package ejerciciosbucles;

public class Ejercicio05 {
    public static void main(String[] args) {
        String[] nombres = {"Vicky", "Karma", "Panda", "Kevin"};
        int contador = 0;

        for (contador = 0; contador < nombres.length; contador++) {
            System.out.println(nombres[contador]);
        }
    }
}

/*
Solución aportada por Mouredev:

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] cities = { "Madrid", "Barcelona", "Valencia", "Sevilla", "Lugo" };

        for (int i = 0; i < cities.length; i++) {
            System.out.println("Ciudad " + (i + 1) + ": " + cities[i]);
        }
 */
