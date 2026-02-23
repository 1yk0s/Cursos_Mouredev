package ejerciciospolimorfismo;

public class Dog extends Animal {

    public Dog(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println("Guau, Guau");
    }

    @Override
    public void getType() {
        System.out.println("El animal es un Perro");
    }
}
