package ejerciciospolimorfismo;

public class Cat extends Animal{

    public Cat(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaaaauu");
    }

    @Override
    public void getType() {
        System.out.println("El animal es un Gato");
    }
}
