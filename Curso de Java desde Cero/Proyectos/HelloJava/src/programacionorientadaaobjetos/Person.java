package programacionorientadaaobjetos;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años");
    }

}
