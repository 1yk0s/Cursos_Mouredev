/*
10.- Usa tres varirables a, b y c y muestra cuál es mayor de las tres.
 */

package ejercicioscondicionales;

public class Ejercicio10 {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        int c = 9;

        System.out.println("Variable \"a\" " + a);
        System.out.println("Variable \"b\" " + b);
        System.out.println("Variable \"c\" " + c +"\n");

        if (a > b && a > c) {
            System.out.println("La variable \"a\" es la mayor " + a);
        } else if(b > a && b > c) {
            System.out.println("La variable \"b\" es la mayor " + b);
        } else {
            System.out.println("La variable \"c\" es la mayor " + c);
        }
    }
}
/*
Solución proporcionada por Mouredev:

// 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.
        int a = 25;
        int b = 42;
        int c = 18;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (a >= b && a >= c) {
            System.out.println("El mayor es 'a' con valor: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es 'b' con valor: " + b);
        } else {
            System.out.println("El mayor es 'c' con valor: " + c);
        }
 */