/*
5.- Crea una clase Vehicle con un método start().
    Luego crea, Car, Bike y Truck que sobrescriban ese método.
    Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
 */

package ejerciciospolimorfismo;

import java.util.ArrayList;

public class EjercicioCinco {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehiculos = new ArrayList<>();
        vehiculos.add(new Car());
        vehiculos.add(new Bike());
        vehiculos.add(new Truck());

        for(Vehicle v : vehiculos) {
            v.start();
        }
    }
}

/*
Solución por Mouredev:

        // 5. Crea una clase Vehicle con un mÃ©todo start(). Luego crea Car, Bike y Truck
        // que sobrescriban ese mÃ©todo. Recorre una lista ArrayList<Vehicle> para llamar
        // a start() en cada uno.
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        // 5. Clases Vehicle, Car, Bike y Truck
    public static class Vehicle {
        public void start() {
            System.out.println("El vehÃ­culo estÃ¡ arrancando");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El coche estÃ¡ arrancando con el motor");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La bicicleta estÃ¡ lista para pedalear");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camiÃ³n estÃ¡ arrancando con motor diÃ©sel");
        }
    }
 */
