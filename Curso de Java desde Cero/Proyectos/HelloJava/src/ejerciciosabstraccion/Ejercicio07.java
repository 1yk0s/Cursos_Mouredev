/*
7.- Crea una clase abstracta Appliance (Aparato) con método turnOn()
    y método turnOff().
    Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
 */

package ejerciciosabstraccion;

public class Ejercicio07 {
    public static void main(String[] args) {
        Appliance[] aparatos = {new TV(), new WashingMachine()};
        for(Appliance a : aparatos) {
            a.turnOn();
            a.turnOff();
        }
    }
}
/*
Solución por Mouredev:
        // 7. Crea una clase abstracta Appliance con mÃ©todo turnOn() y turnOff().
        // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        Appliance tv = new TV();
        Appliance washingMachine = new WashingMachine();
        tv.turnOn();
        tv.turnOff();
        washingMachine.turnOn();
        washingMachine.turnOff();

            // 7. Clases Appliance, TV y WashingMachine
    public static abstract class Appliance {
        public abstract void turnOn();

        public abstract void turnOff();
    }

    public static class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Encendiendo la televisiÃ³n");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando la televisiÃ³n");
        }
    }

    public static class WashingMachine extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Encendiendo la lavadora");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando la lavadora");
        }
    }

 */