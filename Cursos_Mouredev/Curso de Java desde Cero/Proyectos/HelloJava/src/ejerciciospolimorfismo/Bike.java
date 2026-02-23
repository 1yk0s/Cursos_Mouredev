package ejerciciospolimorfismo;

public class Bike extends Vehicle {

    public Bike() {

    }

    @Override
    public void start() {
        System.out.println("La Bici, no arranca pero pedalea");
    }
}
