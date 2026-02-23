package ejerciciospolimorfismo;

public class Cow extends Animal {

    public Cow(String nombre) {
        super(nombre);
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuuuuu");
    }
}
