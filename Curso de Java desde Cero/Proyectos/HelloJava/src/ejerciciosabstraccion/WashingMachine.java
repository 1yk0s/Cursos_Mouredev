package ejerciciosabstraccion;

public class WashingMachine extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("La Lavadora se ha encendido");
    }

    @Override
    public void turnOff() {
        System.out.println("La Lavadora se ha apagado");
    }

}
