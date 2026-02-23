/*
10.- Crea una clase Car con el atributo privado speed.
    Agrega los métodos acelerate(int amount) que aumente la velocidad
    (máximo 120), y brake(int amount) que reduzca la velocidad (mínimo 0);
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio10 {
    public static void main(String[] args) {
        Car coche = new Car("Ibiza", 60);
        System.out.println("Coche: " + coche.getName());
        coche.accelerate(60);
        coche.brake(30);
        coche.accelerate(100);
        coche.brake(200);
    }
}
/*
Solución por Mouredev:

        // 10. Crea una clase Car con el atributo privado speed. Agrega los mÃ©todos
        // accelerate(int amount) que aumente la velocidad (mÃ¡ximo 120) y brake(int
        // amount) que reduzca la velocidad (mÃ­nimo 0).
        CarExample car1 = new CarExample("DMC DeLorean");
        car1.showStatus();
        car1.accelerate(50);
        car1.showStatus();
        car1.accelerate(80);
        car1.showStatus();
        car1.brake(30);
        car1.showStatus();
        car1.brake(100);
        car1.showStatus();

        // 10. Clase CarExample
class CarExample {
    private String model;
    private int speed;
    private final int MAX_SPEED = 120;

    public CarExample(String model) {
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            int newSpeed = speed + amount;
            if (newSpeed <= MAX_SPEED) {
                speed = newSpeed;
                System.out.println("Acelerando +" + amount + " km/h");
            } else {
                speed = MAX_SPEED;
                System.out.println("Velocidad limitada al mÃ¡ximo de " + MAX_SPEED + " km/h");
            }
        } else {
            System.out.println("La cantidad a acelerar debe ser positiva");
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            int newSpeed = speed - amount;
            if (newSpeed >= 0) {
                speed = newSpeed;
                System.out.println("Frenando -" + amount + " km/h");
            } else {
                speed = 0;
                System.out.println("VehÃ­culo detenido");
            }
        } else {
            System.out.println("La cantidad a frenar debe ser positiva");
        }
    }

    public void showStatus() {
        System.out.println("VehÃ­culo: " + model + ", Velocidad actual: " + speed + " km/h");
    }

}

 */