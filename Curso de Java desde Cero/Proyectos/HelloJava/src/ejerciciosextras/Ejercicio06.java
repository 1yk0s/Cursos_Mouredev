/*
06.- Declara una variable static en una clase y accede a ella desde main() sin crear
     un objeto.
 */

package ejerciciosextras;

public class Ejercicio06 {
    static String cadena = "Hola";
    public static void main(String[] args) {
        System.out.println(Ejercicio06.cadena);
    }
}
/*
Solución por Mouredev:
    // Variable static para ejercicio 6
    static int staticCounter = 42;

        // 6. Declara una variable static en una clase y accede a ella desde main() sin
        // crear un objeto.
        System.out.println("Accediendo a variable static sin crear objeto: " + staticCounter);
        System.out.println("TambiÃ©n podemos acceder asÃ­: " + ExtrasCorrections.staticCounter);
 */