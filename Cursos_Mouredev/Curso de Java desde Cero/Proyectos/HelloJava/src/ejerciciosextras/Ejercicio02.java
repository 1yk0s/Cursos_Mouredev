/*
02.- Escribe un programa que lea el nombre y la edad del usuario usando Scanner.
 */

package ejerciciosextras;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- INTRODUCE EL NOMBRE DEL USUARIO ---");
        var nombre = teclado.nextLine();
        System.out.println(" --- INTRODUCE LA EDAD DEL USUARIO ---");
        var edad = teclado.nextInt();
        System.out.println("Nombre del usuario: " + nombre + "\nEdad del usuario: " + edad);
    }
}

/*
Solución por Mouredev:
        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String userName = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int userAge = scanner.nextInt();

        System.out.println("Hola " + userName + ", tienes " + userAge + " aÃ±os");
 */
