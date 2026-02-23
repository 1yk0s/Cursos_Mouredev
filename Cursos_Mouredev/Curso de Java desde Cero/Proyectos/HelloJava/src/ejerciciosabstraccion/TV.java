package ejerciciosabstraccion;

public class TV extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("La Televisión se ha encendido");
    }

    @Override
    public void turnOff(){
        System.out.println("La Televisión se ha apagado");
    }
}

