/*
06.- Declara una variable con el día de la semana (1-7) y muestra su nombre con switch
 */

package ejercicioscondicionales;

public class Ejercicio06 {
    public static void main(String[] args) {
        int dia = 9;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
            break;
            case 3:
                System.out.println("Miércoles");
            break;
            case 4:
                System.out.println("Jueves");
            break;
            case 5:
                System.out.println("Viernes");
            break;
            case 6:
                System.out.println("Sábado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
            default:
                System.out.println("No corresponde con los días de la semana");
        }
    }
}
/*
Solución proporcionada por Mouredev:
        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.
        int dayOfWeek = 3;
        System.out.println("DÃ­a nÃºmero: " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("MiÃ©rcoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("SÃ¡bado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("DÃ­a invÃ¡lido. Debe ser un nÃºmero del 1 al 7");
        }

 */