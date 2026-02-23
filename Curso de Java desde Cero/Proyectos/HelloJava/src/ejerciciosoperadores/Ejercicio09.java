/*
Imprime tres ejemplos de uso de operadores unarios
 */


package ejerciciosoperadores;

public class Ejercicio09 {
    public static void main(String[] args) {

        /*
        Operadores unarios:
        - ! Negación lógica
        - - Cambiar el signo de un número
        - ++ Operador de incremento
        - -- Operador de decremento
         */

        int a = 5;
        boolean b = true;

        System.out.println("Uso la negación lógica \"!\" en true: " + !b);
        System.out.println("Aumento el valor de la variable \"a\": " + ++a);
        System.out.println("Cambio el signo a la variable \"a\": " + -a);
    }
}

/*
Ejemplo de Mouredev:

System.out.println("\n=== OPERADORES UNARIOS ===");
        int num = 5;

        // Positivo y negativo
        System.out.println("NÃºmero original: " + num);
        System.out.println("Positivo: " + (+num));
        System.out.println("Negativo: " + (-num));

        // Pre-incremento y post-incremento
        int counter = 10;
        System.out.println("Contador inicial: " + counter);
        System.out.println("Pre-incremento (++counter): " + (++counter));
        System.out.println("Post-incremento (counter++): " + (counter++));
        System.out.println("Valor final del contador: " + counter);

        // Pre-decremento y post-decremento
        int value = 8;
        System.out.println("Valor inicial: " + value);
        System.out.println("Pre-decremento (--value): " + (--value));
        System.out.println("Post-decremento (value--): " + (value--));
        System.out.println("Valor final: " + value);

 */