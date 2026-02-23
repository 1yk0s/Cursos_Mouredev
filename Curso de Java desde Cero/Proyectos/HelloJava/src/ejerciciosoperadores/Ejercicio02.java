/*
Crea una variable para cada tipo de operador de asignación.
 */

package ejerciciosoperadores;

public class Ejercicio02 {
    public static void main(String[] args) {

        //Variables
        /*
        Operadores de asignación:
        - +=
        - -=
        - *=
        - /=
        - %=
         */
        int a = 14;
        int b = 4;
        int suma = (a += b);
        int resta = (a -= b);
        int multiplicacion = (a *= b);
        int division = (a /= b);
        int resto = (a %= b);

        System.out.println("Operador de asignación += de: " + a + " más " + b + " es: " + suma);
        System.out.println("Ahora \"a\" vale: " + a);
        System.out.println("Operador de asignación -= de: " + a + " menos " + b + " es: " + resta);
        System.out.println("Ahora \"a\" vale: " + a);
        System.out.println("Operador de asignación *= de: " + a + " por " + b + " es: " + multiplicacion);
        System.out.println("Ahora \"a\" vale: " + a);
        System.out.println("Operador de asignación /= de: " + a + " dividido entre " + b + " es: " + division);
        System.out.println("Ahora \"a\" vale: " + a);
        System.out.println("Operador de asignación %= de: " + a + " resto de " + b + " es: " + resto);
        System.out.println("Ahora \"a\" vale: " + a);

    }
}
