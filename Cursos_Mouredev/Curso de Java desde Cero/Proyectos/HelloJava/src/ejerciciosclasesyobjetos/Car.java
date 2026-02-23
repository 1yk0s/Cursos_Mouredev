package ejerciciosclasesyobjetos;

public class Car {

    String brand;
    String model;

    public Car() {

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("La marca del coche es: ".concat(brand));
        System.out.println("El modelo del coche es: ".concat(model));
    }
}
