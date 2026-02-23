/*
Añade alguna negación
 */

package ejerciciosoperadores;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Variables
        boolean azul = true;

        System.out.println("¿El color escrito es azul? " + azul);
        System.out.println("¿El color escrito es azul? " + !azul);
    }
}

/*
Ejemplo propuesto de mouredev:

        System.out.println("\n=== OPERADOR DE NEGACIÃ“N (!) ===");
        boolean isRainingNow = false;
        boolean isNotRaining = !isRainingNow;
        System.out.println("EstÃ¡ lloviendo: " + isRainingNow);
        System.out.println("NO estÃ¡ lloviendo: " + isNotRaining);

        int number = 7;
        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;
        System.out.println("El nÃºmero " + number + " es par: " + isEven);
        System.out.println("El nÃºmero " + number + " es impar: " + isOdd);
 */
