package ejerciciosinheritance;

public class Truck extends Vehiicle {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println("El truck con nombre " + getName() + " es un monstruo");
    }
}
