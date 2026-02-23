/*
04.- Crea una clase Car con atributos brand y model y un método showData().
 */

package ejerciciosclasesyobjetos;

public class Ejercicio04 {
    public static void main(String[] args) {

        Car coche = new Car("Seat", "Ibiza");
        coche.showData();
    }

}
/*
Solucion proporcionada por Mouredev:

// 4. Clase Car
class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("Coche: " + brand + " " + model);
    }
}

        // 4. Crea una clase Car con atributos brand y model y un mÃ©todo showData().
        Car car1 = new Car("DMC", "DeLorean");
        car1.showData();
 */