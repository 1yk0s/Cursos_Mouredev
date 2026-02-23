package ejerciciosinheritance;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("El animal con nombre " + name + " hace un sonido");
    }

    public String getName() {
        return name;
    }


}
