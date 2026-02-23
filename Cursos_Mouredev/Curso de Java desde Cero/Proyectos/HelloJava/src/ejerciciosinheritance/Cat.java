package ejerciciosinheritance;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("El gato con nombre " + name + " hace el sonido: ".concat("Meoow"));
    }
}
