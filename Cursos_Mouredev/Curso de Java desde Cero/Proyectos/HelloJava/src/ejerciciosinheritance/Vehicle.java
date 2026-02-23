package ejerciciosinheritance;

public class Vehicle {
    private String name;

    public Vehicle() {

    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move() {
        System.out.println("El vehículo se está moviendo");
    }

}
