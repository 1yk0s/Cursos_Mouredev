/*
9.- Comprueba si dos Strings son iguales
 */

package ejerciciosstrings;

public class Ejercicio09 {
    public static void main(String[] args) {
        String phrase1 = "Hola, Java";
        String phrase2 = "Hola Java";
        boolean iguales = (phrase1.equals(phrase2));

        System.out.println("¿ Frase uno ".concat(phrase1).concat(" es igual que la frase 2? ") +
                iguales);
    }

}
/*
Solución por Mouredev:

        String string1 = "Java";
        String string2 = "Java";
        String string3 = new String("Java");
        String string4 = "java";

        System.out.println("string1.equals(string2): " + string1.equals(string2));
        System.out.println("string1.equals(string3): " + string1.equals(string3));
        System.out.println("string1.equals(string4): " + string1.equals(string4));
        System.out.println("string1.equalsIgnoreCase(string4): " + string1.equalsIgnoreCase(string4));

        // Diferencia entre == y equals
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1 == string3: " + (string1 == string3));
 */
