/*
02.- Crea una clase Dog con un método bark() que imprima su sonido.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio02 {
    public static void main(String[] args) {

        Dog perro = new Dog();
        perro.name = "Karma";
        perro.raza = "Mestiza";
        System.out.println("El nombre del perro es: " + perro.name + " y es de raza " + perro.raza);
        System.out.println("El perro hace este sonido: ");
        perro.bark();

    }
}
/*
Solución proporcionada por Mouredev:

      // 2. Crea una clase Dog con un mÃ©todo bark() que imprima su sonido.
        Dog dog1 = new Dog("Krypto");
        dog1.bark();

// 3. Clase Dog
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " hace: Â¡Guau guau!");
    }

    public String getName() {
        return name;
    }
}
 */