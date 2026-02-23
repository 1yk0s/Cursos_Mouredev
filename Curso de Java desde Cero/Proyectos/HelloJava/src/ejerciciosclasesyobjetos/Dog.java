package ejerciciosclasesyobjetos;

public class Dog {
    String name;
    String raza;

    public Dog() {

    }

    public Dog (String name, String raza) {
        this.name = name;
        this.raza = raza;
    }

    public void bark() { //Ladrar
        System.out.println("¡Guau! ¡Guau!");
    }
}
