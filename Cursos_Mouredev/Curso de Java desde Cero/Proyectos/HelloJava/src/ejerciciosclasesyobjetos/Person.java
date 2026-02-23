package ejerciciosclasesyobjetos;

public class Person {

    String name;
    int edad;

    public Person(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public void mostrarPersona() {
        System.out.println("Persona: " + name + " edad: " + edad + " años");
    }
}
