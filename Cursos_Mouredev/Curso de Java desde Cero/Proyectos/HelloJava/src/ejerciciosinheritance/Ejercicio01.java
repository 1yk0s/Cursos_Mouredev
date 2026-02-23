/*
01.- Crea una clase Vehicle con un método move().
     Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
     move => Mover.
     honk => Bocinazo.
 */


package ejerciciosinheritance;

public class Ejercicio01 {
    public static void main(String[] args) {
        Car coche = new Car("Seat Ibiza");
        System.out.println("Nombre del coche: " + coche.getName());
        coche.move();
        coche.honk();
    }

}

/*
Solución por Mouredev:

        // 1. Crea una clase Vehicle con un mÃ©todo move(). Luego crea una subclase Car
        // que herede de Vehicle y agrega el mÃ©todo honk().
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Car car = new Car();
        car.move();
        car.honk();

// 1. Clases Vehicle y Car
    public static class Vehicle {
        public void move() {
            System.out.println("El vehÃ­culo se estÃ¡ moviendo");
        }
    }

    public static class Car extends Vehicle {
        public void honk() {
            System.out.println("El coche estÃ¡ tocando la bocina");
        }
    }


 */