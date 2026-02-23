/*
10.- Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
     Recorre la lista y llama a makeSound().
 */

package ejerciciosinheritance;

import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<AnimalSound> lista = new ArrayList<>();
        lista.add(new DogSound());
        lista.add(new CatSound());
        lista.add(new BirdSound());

        for(AnimalSound sonidoanimales : lista) {
            sonidoanimales.makeSound();
        }
    }
}
/*
Solución por Mouredev:

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().
        ArrayList<AnimalSound> animals = new ArrayList<>();
        animals.add(new DogSound());
        animals.add(new CatSound());
        animals.add(new BirdSound());

        for (AnimalSound animalSound : animals) {
            animalSound.makeSound();
        }


    // 10. Clases AnimalSound, DogSound, CatSound y BirdSound
    public static abstract class AnimalSound {
        public abstract void makeSound();
    }

    public static class DogSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El perro hace: Woof");
        }
    }

    public static class CatSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El gato hace: Meow");
        }
    }

    public static class BirdSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El pÃ¡jaro hace: Tweet");
        }
    }

 */