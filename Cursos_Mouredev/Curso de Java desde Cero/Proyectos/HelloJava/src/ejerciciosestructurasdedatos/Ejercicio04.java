/*
04.- Añade cuatro valores al ArrayList y elimina uno a continuación.
 */

package ejerciciosestructurasdedatos;

import java.util.ArrayList;

public class Ejercicio04 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Vicky");
        nombres.add("Karma");
        nombres.add("Panda");
        nombres.add("Kevin");

        System.out.println(nombres);

        //Eliminar valor
        nombres.remove("Kevin");
        System.out.println(nombres);
    }
}

/*
Solución proporcionada por Mouredev:

        // 4. AÃ±ade 4 valores al ArrayList y elimina uno a continuaciÃ³n.
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");
        cities.add("Sevilla");
        System.out.println("ArrayList despuÃ©s de aÃ±adir 4 ciudades: " + cities);
        System.out.println("TamaÃ±o: " + cities.size());

        cities.remove("Barcelona");
        System.out.println("ArrayList despuÃ©s de eliminar Barcelona: " + cities);
        System.out.println("TamaÃ±o: " + cities.size());
 */
