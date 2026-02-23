/*
08.- Escribe un programa que determine si puedes entrar al cine.
     Debes tener al menos 15 años o ir acompañado
 */

package ejercicioscondicionales;

public class Ejercicio08 {
    public static void main(String[] args) {
        int edad = 14;
        boolean acompañado = true;

        System.out.println("La edad del usuario es de: " + edad + " años");
        System.out.println("¿Va acompañado?\n");
        if (acompañado) {
            System.out.println("Sí\n");
        } else {
            System.out.println("No\n");
        }
        if (edad >= 15) {
            System.out.println("Por la edad, puedes entrar solo");
        } else if(edad < 15 && acompañado) {
            System.out.println("Puedes entrar porque vas acompañado");
        } else if(edad < 15 && acompañado == false) {
            System.out.println("No puedes entrar por la edad y porque no vas acompañado");
        } else {
            System.out.println("¿Quién eres?");
        }
    }
}
/*
Solución por Mouredev:
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.
        int cinemaAge = 12;
        boolean isAccompanied = true;
        System.out.println("Edad: " + cinemaAge + " aÃ±os");
        System.out.println("Â¿Va acompaÃ±ado? " + isAccompanied);

        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("NO puede entrar al cine");
        }
 */