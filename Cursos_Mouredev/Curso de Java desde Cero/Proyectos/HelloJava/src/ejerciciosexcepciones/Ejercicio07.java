/*
07.- Crea una clase TemperatureChecker que lanza una excepción personalizada
     si la temperatura es menor a -50 o mayor a 50.
 */

package ejerciciosexcepciones;

public class Ejercicio07 {
    public static void main(String[] args) {

        try {
            checkTemperature(60);
        } catch (TemperatureChecker e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            checkTemperature(-30);
        } catch (Exception e) {
            System.out.println("Tipo de excepción: " + e.getClass());
        }

    }

    public static void checkTemperature(int temperature) throws TemperatureChecker {
        if (temperature < -50 || temperature > 50) {
            throw new TemperatureChecker("La temperatura debe estar entre -50 y 50 grados");
        } else {
            System.out.println("Temperatura válida");
        }
    }
}

class TemperatureChecker extends Exception {
    public TemperatureChecker(String message) {
        super(message);
    }
}


/*
Solución por Mouredev:

        // 7. Crea una clase TemperatureChecker que lanza una excepciÃ³n personalizada si
        // la temperatura es menor a -50 o mayor a 50.
        TemperatureChecker temperatureChecker = new TemperatureChecker();

        try {
            temperatureChecker.checkTemperature(25);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error de temperatura: " + e.getMessage());
        }

        try {
            temperatureChecker.checkTemperature(60);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error de temperatura: " + e.getMessage());
        }

            // 7. Clase TemperatureChecker con excepciÃ³n personalizada
    public static class TemperatureChecker {
        public void checkTemperature(double temperature) throws InvalidTemperatureException {
            if (temperature < -50 || temperature > 50) {
                throw new InvalidTemperatureException("La temperatura debe estar entre -50 y 50 grados");
            } else {
                System.out.println("Temperatura vÃ¡lida: " + temperature + " grados");
            }
        }
    }
 */