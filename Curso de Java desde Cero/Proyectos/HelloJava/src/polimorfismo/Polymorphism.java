package polimorfismo;

public class Polymorphism {

    //Polimorfismo.

    public static void main(String[] args) {

        //Polimorfismo por herencia (sobrescritura)


        var animal = new Animal();
        animal.sound();
        var perro = new Dog();
        perro.sound();

        //Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculadora = new Calculator();
        System.out.println(calculadora.sum(3, 5));
        System.out.println(calculadora.sum(3.2, 5.4));

    }

    public static class Animal{
        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    public static class Calculator {
        public int sum(int a, int b) {
            return a + b;
        }
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
        public double sum(double a, double b) {
            return a + b;
        }
    }
}
