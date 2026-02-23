/*
09.- Crea varios Person y guárdalos en un ArrayList.
 */

package ejerciciosclasesyobjetos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio09 {
    public static void main(String[] args) {
        Person persona1 = new Person("Kevin", 31);
        Person persona2 = new Person("Victoria", 30);
        Person persona3 = new Person("Karma", 10);
        Person persona4 = new Person("Panda", 10);

        ArrayList<Person> listaPersonas = new ArrayList<>();

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);

        for (Person lista : listaPersonas) {
            lista.mostrarPersona();
        }
    }
}
/*
Solución por Mouredev:

// 9. Clase Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " aÃ±os.");
    }
}

        // 9. Crea varios objetos Person y guÃ¡rdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Brais Moure", 21));
        people.add(new Person("MoureDev", 38));
        people.add(new Person("Brais MoureDev", 42));

        System.out.println("Lista de personas:");
        for (Person person : people) {
            person.sayHello();
 */