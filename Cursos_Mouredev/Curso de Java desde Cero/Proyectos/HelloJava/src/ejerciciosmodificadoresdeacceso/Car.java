package ejerciciosmodificadoresdeacceso;

public class Car {

    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int accelerate(int amount) {
        speed += amount;
        if(speed >= 1 && speed <= 120) {
            System.out.println("Acelerando, velocidad actual: " + speed);
        } else {
            System.out.println("La velocidad máxima es 120, actual: " + speed);
        }
        return speed;
    }

    public int brake(int amount) {
        speed -= amount;
        if(speed >= 1 && speed <= 120) {
            System.out.println("Frenando, velocidad actual: " + speed);
        } else {
            System.out.println("La velocidad mínima es 0, actual: " + speed);
        }
        return speed;
    }
}
