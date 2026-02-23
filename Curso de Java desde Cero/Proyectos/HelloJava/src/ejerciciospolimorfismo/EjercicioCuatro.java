/*
4.- Crea una clase Greeter (Recepcionista) con dos métodos greet(): uno que salude
    con "Hello" y otro que reciba un nombre y salude con "Hello", [nombre].
 */

package ejerciciospolimorfismo;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Greeter recepcionita = new Greeter();
        recepcionita.saludar();
        recepcionita.saludarNombre("Karma");
    }
}

/*
Solución por Mouredev:

        // 4. Crea una clase Greeter con dos mÃ©todos greet(): uno que salude con
        // â€œHelloâ€, y otro que reciba un nombre y salude con â€œHello, [nombre]â€.
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Brais");

        // 4. Clase Greeter
    public static class Greeter {
        public void greet() {
            System.out.println("Hello");
        }

        public void greet(String name) {
            System.out.println("Hello, " + name);
        }
    }
 */
