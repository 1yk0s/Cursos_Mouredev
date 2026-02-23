package ejerciciosinheritance;

public class Carr extends Vehiicle {

    public Carr(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("El Coche con nombre " + getName() + " es un vehículo de cuatro ruedas");
    }

}
