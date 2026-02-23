/*
01.- Crea una variable de tipo String inicializada como null y verifica que no
     está vacía antes de usarla.
 */

package ejerciciosextras;

public class Ejercicio01 {
    public static void main(String[] args) {
        String name = null;
        if(name != null) {
            System.out.println(name);
        } else {
            System.out.println("la variable name corresponde a " + name);
        }

        name = "1yk0s";
        if(name != null) {
            System.out.println("Contenido de variable name: " + name.toUpperCase());
        } else {
            System.out.println("Sigue correspondiendo a null");
        }
    }
}
/*
Solución por Mouredev:
        // 1. Crea una variable de tipo String inicializada como null y verifica que no
        // estÃ© vacÃ­a antes de usarla.
        String text = null;

        if (text != null) {
            System.out.println("El texto es: " + text.toUpperCase());
        } else {
            System.out.println("La variable estÃ¡ vacÃ­a (null)");
        }

        text = "Hola Java";
        if (text != null) {
            System.out.println("Ahora el texto es: " + text.toUpperCase());
        }
 */