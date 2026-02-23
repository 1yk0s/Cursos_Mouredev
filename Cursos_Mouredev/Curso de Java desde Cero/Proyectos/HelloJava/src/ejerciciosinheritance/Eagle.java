package ejerciciosinheritance;

public class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("El águila " + getName() + " está volando");
    }

    public void originalFly() {
        super.fly();
    }

}
