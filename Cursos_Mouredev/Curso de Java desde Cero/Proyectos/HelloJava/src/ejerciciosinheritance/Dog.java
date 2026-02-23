package ejerciciosinheritance;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("El perro con nombre " + name + " hace: ".concat("Woof"));
    }
}
