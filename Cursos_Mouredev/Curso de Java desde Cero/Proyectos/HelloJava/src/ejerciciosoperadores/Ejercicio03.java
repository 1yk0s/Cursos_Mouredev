/*
Imprime 3 operaciones verdaderas con diferentes operadores
de comparación.
 */

package ejerciciosoperadores;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Operadores de comparación:
        - == (Igual a)
        - != (Distinto a)
        - > (Mayor que)
        - < (Menor que)
        - >= (Mayor o igual que)
        - <= (Menor o igual que)
         */

        int variable1;
        int variable2;

        variable1 = 3;
        variable2 = 3;
        System.out.println(variable1 + " ¿Es igual que: " + variable2 + " ? " + (variable1 == variable2));
        variable1 = 3;
        variable2 = 4;
        System.out. println(variable1 + " ¿Es distinto a: " + variable2 + " ? " + (variable1 != variable2));
        System.out.println(variable1 + " ¿Es menor que: " + variable2 + " ? " + (variable1 < variable2));

    }
}
