/*
Utiliza el operador lógico OR ||
 */

package ejerciciosoperadores;

public class Ejercicio06 {
    public static void main(String[] args) {

        //Variables
        int a = 14;
        int b = 4;
        boolean falso = false;

        System.out.println("¿Las variables \"a\" y \"b\" son distintas? " + (a != b || false));
        System.out.println(" ¿Las variables \"a\" y \"b\" son iguales? " + (a == b  || false));
    }
}

/*
Solución proporcionada por Mouredev:

      System.out.println("\n=== OPERADOR LÃ“GICO OR (||) ===");
        boolean isWeekend = true;
        boolean isVacation = false;
        boolean canRest = isWeekend || isVacation;
        System.out.println("Es fin de semana: " + isWeekend + ", Es vacaciones: " + isVacation);
        System.out.println("Â¿Puede descansar? " + canRest);

        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));
 */
