/*
Combina ambos operadores lógicos.
AND && y OR ||
 */

package ejerciciosoperadores;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Variables
        boolean aprobado = true;
        boolean suspenso = false;
        int nota1 = 5;
        int nota2 = 4;

        System.out.println("Para aprobar necesitas un: " + nota1);
        System.out.println("¿Has aprobado? " + ((nota1 >= 5 && aprobado) || suspenso));
    }
}

/*
Solución proporcionada por Mouredev:
        System.out.println("\n=== COMBINANDO AND Y OR ===");
        int temperature = 25;
        boolean isSunny = true;
        boolean isRaining = false;

        boolean isGoodWeather = (temperature > 20 && isSunny) || !isRaining;
        System.out.println("Temperatura: " + temperature + " °C, Soleado: " + isSunny + ", Llueve: " + isRaining);
        System.out.println("Â¿Es buen clima? " + isGoodWeather);

        // Ejemplo con precedencia
        boolean result = true || false && false; // AND tiene precedencia sobre OR
        System.out.println("true || false && false: " + result);
 */