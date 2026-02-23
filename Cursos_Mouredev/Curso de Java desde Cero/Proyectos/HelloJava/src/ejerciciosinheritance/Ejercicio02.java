/*
02.- Define una clase Person con los atributos name y age.
     Luego crea una clase Student que agregue el atributo grade y un método study().
     grade => calificación.
     study => estudiar.
 */

package ejerciciosinheritance;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Instancia clase Person
        Person persona = new Person("1yk0s", 31);
        System.out.println("Nombre de la persona: " + persona.getName());
        System.out.println("Edad de la persona: " + persona.getAge());
        System.out.println();

        //Instancia clase Student
        Student estudiante = new Student("1yk0s", 31, 60);
        System.out.println("Nombre del estudiante: " + estudiante.getName());
        System.out.println("Edad del estudiante: " + estudiante.getAge());
        estudiante.getCalificacion();
        estudiante.study();

    }
}
/*
Solución por Mouredev:

            // 2. Define una clase Person con los atributos name y age. Luego crea una clase
        // Student que agregue el atributo grade y un mÃ©todo study().
        Person person = new Person("Brais", 30);
        System.out.println("Persona: " + person.name + ", edad: " + person.age);

        Student student = new Student("MoureDev", 38, "A");
        System.out.println("Estudiante: " + student.name + ", edad: " + student.age + ", nota: " + student.grade);
        student.study();

    // 2. Clases Person y Student
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person {
        String grade;

        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }

        public void study() {
            System.out.println(name + " estÃ¡ estudiando");
        }
    }

 */
