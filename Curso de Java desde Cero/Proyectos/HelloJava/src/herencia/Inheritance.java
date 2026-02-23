package herencia;

public class Inheritance {
    public static void main(String[] args) {

        //Inheritance => Herencia ("es un")
        var animal = new Animal("Mi animal");
        var perro = new Dog("Karma", 10);
        var gato = new Cat("Panda");
        var pajaro = new Bird("Fénix");
        // animal.name = "Mi animal";
        animal.eat();
        // perro.name = "Karma";
        perro.eat();
        // gato.name = "Panda";
        gato.eat();
        // pajaro.name = "Fénix";
        pajaro.eat();
        pajaro.fly();
    }

    public static class Animal {
        final String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " está comiendo");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            System.out.println("El perro con nombre " + name + " está comiendo");
        }

    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void eat() {
            System.out.println("El gato con nombre " + name + " está comiendo");
        }

    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        /*
        @Override
        public void eat() {
           super.eat();
        }
        */

        @Override
        public void eat() {
            System.out.println("El pájaro con nombre " + name + " está comiendo");
        }
        public void fly() {
            System.out.println("El pájaro con nombre " + name + " está volando");
        }
    }

}
