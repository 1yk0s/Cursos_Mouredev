/*
01.- Crea una clase Person con atributos privados name y age.
     Usa los métodos getName(), getAge() y setAge() para asignar
     y mostrar los valores desde otra clase.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio01 {
    public static void main(String[] args) {

        Person persona = new Person("1yk0s", 31);
        persona.setAge(32);
        System.out.println("La edad de la persona es: " + persona.getAge());
        System.out.println("El nombre de la persona es: " + persona.getName());
    }
}

/*
Solución por Mouredev:

        // 1. Crea una clase Person con atributos privados name y age. Usa los mÃ©todos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.
        PersonExample person1 = new PersonExample();
        person1.setName("Brais Moure");
        person1.setAge(38);
        System.out.println("Nombre: " + person1.getName());
        System.out.println("Edad: " + person1.getAge());

        // 1. Clase PersonExample
class PersonExample {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("El nombre no puede estar vacÃ­o");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("La edad debe estar entre 0 y 120 aÃ±os");
        }
    }
}
 */