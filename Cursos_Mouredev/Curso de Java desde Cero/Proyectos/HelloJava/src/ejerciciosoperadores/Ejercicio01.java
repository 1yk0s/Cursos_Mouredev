/*
Crea una variable con el resultado de cada operación aritmética.
 */


package ejerciciosoperadores;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Variables
        int a = 14;
        int b = 4;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int resto = a % b;

        System.out.println("Suma de " + a + " más " + b + " es: " + suma );
        System.out.println("Resta de " + a + " menos " + b + " es: " + resta);
        System.out.println("Multiplicación de " + a + " por " + b + " es: " + multiplicacion);
        System.out.println("División de " + a + " dividido entre " + b + " es: " + division);
        System.out.println("La operación resto de " + a + " y " + b + " es: " + resto);
    }
}
