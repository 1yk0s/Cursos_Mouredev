/*
09.- Modifica uno de los contactos y elimina otro
 */

package ejerciciosestructurasdedatos;

import java.util.HashMap;

public class Ejercicio09 {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        System.out.println("Tamaño del Mapa: " + agenda.size());
        agenda.put("Kevin", 617275974L);
        agenda.put("Vicky", 681083690L);
        agenda.put("Karma", 666555444L);
        System.out.println("Tamaño del Mapa: " + agenda.size());
        System.out.println(agenda);
        System.out.println("Se modifica el elemento con clave Karma");
        agenda.replace("Karma", 555444333L);
        System.out.println(agenda);
        System.out.println("Se elimina el elemento con clave Kevin");
        agenda.remove("Kevin");
        System.out.println(agenda);
    }
}
/*
Solución proporcionada por Mouredev:

        // 9. Modifica uno de los contactos y elimina otro.
        System.out.println("TelÃ©fono de Brais antes: " + phoneBook.get("Brais"));
        phoneBook.put("Brais", "111-222-333");
        System.out.println("TelÃ©fono de Brais despuÃ©s: " + phoneBook.get("Brais"));

        phoneBook.remove("Moure");
        System.out.println("Agenda despuÃ©s de eliminar a Moure: " + phoneBook);
        System.out.println("TamaÃ±o: " + phoneBook.size());
 */