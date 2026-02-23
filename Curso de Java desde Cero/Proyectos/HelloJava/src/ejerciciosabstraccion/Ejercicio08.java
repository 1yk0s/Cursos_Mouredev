/*
8.- Crea dos interfaces Flyable y Swimmeable.
    Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar
    y nadar.
 */

package ejerciciosabstraccion;

public class Ejercicio08 {
    public static void main(String[] args) {

        Duck pato = new Duck();
        pato.fly();
        pato.swim();
    }
}

/*
Solución por Mouredev:

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
        // implemente ambas interfaces y muestre cÃ³mo puede volar y nadar.
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

            // 8. Interfaces Flyable y Swimmable, y clase Duck
    public interface Flyable {
        void fly();
    }

    public interface Swimmable {
        void swim();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato estÃ¡ volando");
        }

        @Override
        public void swim() {
            System.out.println("El pato estÃ¡ nadando");
        }
    }

 */
