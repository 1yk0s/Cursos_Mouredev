/*
1. Crea una clase Animal con el método makeSound().
   Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos
   diferentes.
   Llama al método desde una lista de Animal.
 */


package ejerciciospolimorfismo;

import java.util.ArrayList;

public class EjercicioUno {

    public static void main(String[] args) {
        //Lista para los animales
        ArrayList<Animal> lista = new ArrayList<Animal>();
        //Añadir objetos de animales a la lista
        lista.add(new Animal("animal"));
        lista.add(new Cat("gato"));
        lista.add(new Cow("vaca"));
        lista.add(new Dog("perro"));

        //Hacer que cada uno de ellos, invoce el sonido
        for (Animal a : lista) {
            a.makeSound();
        }
    }
}

/*
Solución por Mouredev:

 // 1. Crea una clase Animal con el mÃ©todo makeSound(). Luego crea subclases Dog,
        // Cat y Cow que sobrescriban ese mÃ©todo con sonidos diferentes. Llama al mÃ©todo
        // desde una lista de Animal.
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Cow());

        for (Animal animal : animalList) {
            animal.makeSound();
        }
        // 1. Clases Animal, Dog, Cat y Cow
    public static class Animal {
        public void makeSound() {
            System.out.println("El animal hace un sonido");
        }
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

    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("La vaca hace: Muu");
        }
    }

 */
