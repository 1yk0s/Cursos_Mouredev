package ejerciciosinheritance;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public void honk() {
        System.out.println("PIIIIIIIIIIII");
    }
}
