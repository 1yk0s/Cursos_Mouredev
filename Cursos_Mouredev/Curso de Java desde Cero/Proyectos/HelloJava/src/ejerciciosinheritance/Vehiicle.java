package ejerciciosinheritance;

public class Vehiicle {
    private String name;

    public Vehiicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println("El vehículo con nombre " + name + " es un vehículo");
    }


}
