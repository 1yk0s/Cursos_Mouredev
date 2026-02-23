package ejerciciosmodificadoresdeacceso;

public class Temperature {

    private double celsius;

    public Temperature(double celsius) {
        this.celsius = setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public double setCelsius(double celsius) {
        if(celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("La temperatura debe de estar entre -100 y 100");
        }
        return celsius;
    }

}
