/*
08.- Crea un HashMap donde la clave sea un nombre y el valor un número de teléfono.
    Crea tres contactos.
 */

package ejerciciosestructurasdedatos;

import java.util.HashMap;

public class Ejercicio08 {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        agenda.put("Kevin", 617275974L);
        agenda.put("Vicky", 681083690L);
        agenda.put("Karma", 666555444L);
        System.out.println(agenda);
    }
}
/*
Solución proporcionada por Mouredev:

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el nÃºmero de
        // telÃ©fono. AÃ±ade tres contactos.
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Brais", "123-456-789");
        phoneBook.put("Moure", "987-654-321");
        phoneBook.put("MoureDev", "555-123-456");
        System.out.println("\nAgenda de telÃ©fonos: " + phoneBook);
        System.out.println("TamaÃ±o: " + phoneBook.size());
 */
