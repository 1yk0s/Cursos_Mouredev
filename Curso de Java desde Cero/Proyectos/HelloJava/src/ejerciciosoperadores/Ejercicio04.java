/*
Imprime 3 comparaciones falsas con diferentes operadores de comparación.
 */
package ejerciciosoperadores;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Operadores de comparación:
        - == (Igual que)
        - != (Distinto a)
        - < (Menor que)
        - <= (Menor o igual que)
        - > (Mayor que)
        - >= (Mayor o igual que)
         */

        int a = 4;
        int b = 7;

        System.out.println(a + " ¿Es mayor o igual que " + b + " ? " + (a >= b));
        System.out.println(a + " ¿Es igual que " + b + " ? " + (a == b));
        System.out.println(a + " ¿Es mayor que " + b + " ? " + (a > b));

    }
}
