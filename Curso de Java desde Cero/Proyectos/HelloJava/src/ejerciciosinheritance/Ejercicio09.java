/*
09.- Crea una clase Vehicle y tres subclases: Car, Bike y Truck.
     Cada una con un método describe() sobreescrito.
 */

package ejerciciosinheritance;

public class Ejercicio09 {
    public static void main(String[] args) {

        Vehiicle vehiculo = new Vehiicle("Vehiculo");
        vehiculo.describe();
        Carr coche = new Carr("Ibiza");
        coche.describe();
        Bike bici = new Bike("Bicicleta");
        bici.describe();
        Truck monster = new Truck("Monster Truck");
        monster.describe();

    }
}
/*
Solución por Mouredev:

            // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
        // un mÃ©todo describe() sobrescrito.
        VehicleBase vehicleBase1 = new CarVehicle();
        VehicleBase vehicleBase2 = new BikeVehicle();
        VehicleBase vehicleBase3 = new TruckVehicle();

        vehicleBase1.describe();
        vehicleBase2.describe();
        vehicleBase3.describe();

    // 9. Clases VehicleBase, CarVehicle, BikeVehicle y TruckVehicle
    public static abstract class VehicleBase {
        public abstract void describe();
    }

    public static class CarVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy un coche con 4 ruedas");
        }
    }

    public static class BikeVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy una bicicleta con 2 ruedas");
        }
    }

    public static class TruckVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy un camiÃ³n para transportar carga");
        }
    }


 */