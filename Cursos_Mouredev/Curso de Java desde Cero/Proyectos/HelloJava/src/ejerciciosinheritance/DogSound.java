package ejerciciosinheritance;

public class DogSound extends AnimalSound {

    @Override
    public void makeSound() {
        System.out.println("El perro hace: Woof");
    }
}
