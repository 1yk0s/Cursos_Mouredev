/*
6.- Crea una interfaz Movable con el método move().
    Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
 */

package ejerciciosabstraccion;

public class Ejercicio06 {
    public static void main(String[] args) {
        Car coche = new Car();
        Robot robot = new Robot();
        coche.move();
        robot.move();
    }
}
/*
Solución por Mouredev:
        // 6. Crea una interfaz Movable con el mÃ©todo move(). Haz que las clases Car y
        // Robot implementen ese mÃ©todo con comportamientos diferentes.
        Movable car = new Car();
        Movable robot = new Robot();
        car.move();
        robot.move();

            // 6. Interfaz Movable y clases Car y Robot
    public interface Movable {
        void move();
    }

    public static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("El coche se mueve por la carretera");
        }
    }

    public static class Robot implements Movable {
        @Override
        public void move() {
            System.out.println("El robot se mueve con sus servomotores");
        }
    }
 */