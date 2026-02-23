package ejerciciosinheritance;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fly() {
        System.out.println("El pájaro " + name + " está volando");
    }
}
