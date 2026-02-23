/*
3.- Define una clase abstracta Animal con el método makeSound().
    Implementa Dog y Cat para que haga sonidos diferentes.
    Crea un array de Animal para mostrar polimorfismo.
 */

package ejerciciosabstraccion;

import java.lang.reflect.Array;

public class Ejercicio03 {
    public static void main(String[] args) {
        Animal[] animales = {new Dog(), new Cat()};
        for(Animal a : animales) {
            a.makeSound();
        }
    }
}
/*
Solución por Mouredev:

        // 3. Define una clase abstracta Animal con el mÃ©todo makeSound(). Implementa
        // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
        // mostrar polimorfismo.
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.makeSound();
        }

            // 3. Clases Animal, Dog y Cat
    public static abstract class Animal {
        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El perro hace: Guau");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El gato hace: Miau");
        }
    }

 */