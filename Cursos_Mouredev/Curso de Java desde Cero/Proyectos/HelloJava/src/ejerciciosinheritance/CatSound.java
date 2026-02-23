package ejerciciosinheritance;

public class CatSound extends AnimalSound {
    @Override
    public void makeSound() {
        System.out.println("El gato hace: Miau");
    }
}
