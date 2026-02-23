/*
04.- Crea una variable global message y otra local message dentro del método main.
     Muestra ambas.
 */

package ejerciciosextras;

public class Ejercicio04 {
    static String message = "Variable Global";

    public static void main(String[] args) {
        String message = "Variable local";
        System.out.println(message);
        System.out.println(Ejercicio04.message);
    }
}
/*
Solución por Mouredev:

    // Variable global (static) para el ejercicio 4 y 6
    static String globalMessage = "Mensaje global";
        // 4. Crea una variable global message y otra local message dentro del mÃ©todo
        // main(). Muestra ambas.
        String localMessage = "Mensaje local";

        System.out.println("Variable global: " + globalMessage);
        System.out.println("Variable local: " + localMessage);
        showGlobalMessage(); // FunciÃ³n que accede a la variable global

            // 4. FunciÃ³n que muestra la variable global
    public static void showGlobalMessage() {
        System.out.println("Accediendo desde funciÃ³n: " + globalMessage);
    }
 */
