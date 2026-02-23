/*
07.- Simula un sistema de notas.
     Muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota, (0-100).
 */

package ejercicioscondicionales;

public class Ejercicio07 {
    public static void main(String[] args) {
        int nota = 60;
        System.out.println("Tu nota es de: " + nota + " puntos");
        if (nota >= 71 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else if(nota >= 50 && nota <= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}
/*
Solución proporcionada por Mouredev:
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).
        int grade = 85;
        System.out.println("Nota: " + grade);

        if (grade >= 90 && grade <= 100) {
            System.out.println("Sobresaliente");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("Aprobado");
        } else if (grade >= 0 && grade < 70) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota invÃ¡lida. Debe estar entre 0 y 100");
        }

 */