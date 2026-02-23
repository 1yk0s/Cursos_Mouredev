package abstraction;

public class Abstraction {
    public static void main(String[] args) {

        //Abstracción.

        //Clase Abstracta
        var perro = new Dog();
        perro.sleep();
        perro.sound();

        var gato = new Cat();
        gato.sleep();
        gato.sound();
    }

    //Clases Abstractas.

    public static abstract class Animal {

        public void sleep() {

            System.out.println("El animal está durmiendo");
        }

        //Método sin implementación
        public abstract void sound();
    }

    public static class Dog extends Animal {
        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }

        @Override
        public void sound() {
            System.out.println("El perro ladra");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void sleep() {
            System.out.println("El gato está durmiendo");
        }

        @Override
        public void sound() {
            System.out.println("El gato maúlla");
        }
    }

    public static class Bird extends Animal implements Flying, Flying2 {
        @Override
        public void sound() {
            System.out.println("El Pájaro pía");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }

        @Override
        public void fly2() {

        }
    }

    public static class Murcielago extends Animal implements Flying {
        @Override
        public void sound() {
            System.out.println("El Murciélago emite ultrasonidos");
        }
        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }

    //.- Interface
    public interface Flying {
        void fly();
    }

    public interface Flying2 {
        void fly2();
    }
}
