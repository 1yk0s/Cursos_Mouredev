package ejerciciosabstraccion;

public class Duck implements Swimmeable.Swimm, Flyable.Fly {

    @Override
    public void swim() {
        System.out.println("El Pato nada");
    }

    @Override
    public void fly() {
        System.out.println("El Pato vuela");
    }
}
