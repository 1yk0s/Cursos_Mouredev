/*
06.- Usa un for each para recorrer un HashSet y un HashMap
 */

package ejerciciosbucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio06 {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<>();
        HashSet<String> agendaSet = new HashSet<>();

        agenda.put("Kevin", 617275974L);
        agenda.put("Vicky", 681083690L);
        agendaSet.add("Vicky");
        agendaSet.add("Karma");
        agendaSet.add("Panda");
        agendaSet.add("Kevin");


        //Lo recorro mediante un entrySet()

        for(Map.Entry<String, Long> agenda2 : agenda.entrySet()) {
            System.out.println("Clave: " + agenda2.getKey() + " Valor: " + agenda2.getValue());
        }

        for (String agendaSet2 : agendaSet) {
            System.out.println(agendaSet2);
        }
    }
}

/*
Solución por Mouredev:

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> colors = new HashSet<>();
        colors.add("azul");
        colors.add("naranja");
        colors.add("verde");
        colors.add("amarillo");

        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Brais", 25);
        ages.put("Moure", 30);
        ages.put("MoureDev", 38);
        ages.put("Pro", 1);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
 */
