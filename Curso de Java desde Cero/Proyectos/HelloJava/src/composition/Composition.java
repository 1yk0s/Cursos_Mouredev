package composition;

public class Composition {
    public static void main(String[] args) {

        //Composición ("Tiene un").
        var coche = new Car();
        coche.on();
        // coche.motor

    }

    public static class Engine {
        public void on() {
            System.out.println("El motor se enciende");
        }
    }

    public static class Car {
        final private Engine motor = new Engine();

        public void on() {
            motor.on();
        }
    }
}
