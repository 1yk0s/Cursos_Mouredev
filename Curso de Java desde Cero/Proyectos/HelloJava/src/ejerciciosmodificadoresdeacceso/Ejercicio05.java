/*
05.- Crea una clase Temperature con el atributo privado celsius.
     El método setCelsius(double celsius) solo debe aceptar valores
     entre -100 y 100.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio05 {
    public static void main(String[] args) {
        Temperature temperatura = new Temperature(-50);
        System.out.println(temperatura.getCelsius());
        Temperature temperatura1 = new Temperature(-300);
        System.out.println(temperatura1.getCelsius());

    }
}
/*
Solución por Mouredev:

        // 5. Crea una clase Temperature con el atributo privado celsius. El mÃ©todo
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        TemperatureExample temp1 = new TemperatureExample();
        temp1.setCelsius(25.5);
        System.out.println("Temperatura: " + temp1.getCelsius() + "Â°C");
        temp1.setCelsius(150.0);
        temp1.setCelsius(-150.0);

    // 5. Clase TemperatureExample
    class TemperatureExample {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
            System.out.println("Temperatura establecida a: " + celsius + "Â°C");
        } else {
            System.out.println("La temperatura debe estar entre -100Â°C y 100Â°C");
        }
    }

    public double getCelsius() {
        return celsius;
    }
}



 */