package ejerciciosinheritance;

public class BirdSound extends AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("El pájaro hace: \"Pio pio pip pio \"");
    }
}
