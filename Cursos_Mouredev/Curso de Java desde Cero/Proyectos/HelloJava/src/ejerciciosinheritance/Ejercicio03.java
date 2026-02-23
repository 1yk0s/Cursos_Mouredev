/*
03.- Crea una clase Animal con el método makeSound().
     Haz que Dog diga "Woof" y Cat diga "Meow" sobreescribiendo
     este método.
 */

package ejerciciosinheritance;

public class Ejercicio03 {
    public static void main(String[] args) {

        Animal animal = new Animal("1yk0s");
        Dog perroUno = new Dog("Karma");
        Dog perroDos = new Dog("Nanouk");
        Cat gato = new Cat("Panda");

        animal.makeSound();
        perroUno.makeSound();
        perroDos.makeSound();
        gato.makeSound();

    }
}

/*
Solución por Mouredev:

        // 3. Crea una clase Animal con el mÃ©todo makeSound(). Haz que Dog diga â€œWoofâ€ y
        // Cat diga â€œMeowâ€ sobrescribiendo ese mÃ©todo.
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

            // 3. Clases Animal, Dog y Cat
    public static class Animal {
        public void makeSound() {
            System.out.println("El animal hace un sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }
 */
