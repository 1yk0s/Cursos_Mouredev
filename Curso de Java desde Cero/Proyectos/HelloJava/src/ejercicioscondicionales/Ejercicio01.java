/*
1.- Establece la edad del usuario y muestra si puede votar.
    (mayor o igual de 18).
 */

package ejercicioscondicionales;

public class Ejercicio01 {
    public static void main(String[] args) {
        int edad = 17;

        System.out.println("La edad del usuario es: " + edad);
        if (edad > 18) {
            System.out.println("El usuario vota desde hace al menos 1 año");
        } else if (edad >= 18) {
            System.out.println("El usuario vota este año o lleva al menos 1 año votando");
            if (edad == 18) {
                System.out.println("El usuario es el primer año que vota");
            }
        } else {
            System.out.println("El usuario no puede votar");
        }
    }
}

/*
Solución proporcionada por Mouredev:
// 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).
        int userAge = 20;
        System.out.println("Edad del usuario: " + userAge);

        if (userAge >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario NO puede votar");
        }
 */