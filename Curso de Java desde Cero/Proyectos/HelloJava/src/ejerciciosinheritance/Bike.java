package ejerciciosinheritance;

public class Bike extends Vehiicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("La bicicleta con nombre " + getName() + " es un vehículo de dos ruedas");
    }
}
