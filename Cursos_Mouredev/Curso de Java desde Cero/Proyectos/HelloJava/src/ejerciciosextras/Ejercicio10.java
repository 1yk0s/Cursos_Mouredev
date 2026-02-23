/*
10.- Haz debug del código implementado haciendo uso de sus diferentes herramientas.
 */

package ejerciciosextras;

public class Ejercicio10 {
    public static void main(String[] args) {
        debugExample();
    }

    public static void debugExample() {
        int a = 5;
        int b = 10;
        int result = a + b;

        System.out.println("Debug: a = " + a);
        System.out.println("Debug: b = " + b);
        System.out.println("Debug: resultado = " + result);

        if(result > 10) {
            System.out.println("El resultado es mayor que 10");
        }
    }
}
/*
    // 10. FunciÃ³n para practicar debug
    public static void debugExample() {
        int a = 5;
        int b = 10;
        int result = a + b;

        // Puntos de debug tÃ­picos:
        System.out.println("Debug: a = " + a); // Verificar valor de a
        System.out.println("Debug: b = " + b); // Verificar valor de b
        System.out.println("Debug: resultado = " + result); // Verificar resultado

        // Para debug real, podrÃ­as poner breakpoints en estas lÃ­neas
        if (result > 10) {
            System.out.println("El resultado es mayor que 10");
        }
    }
 */