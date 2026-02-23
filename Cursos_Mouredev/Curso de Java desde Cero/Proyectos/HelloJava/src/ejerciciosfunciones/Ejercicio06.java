/*
06.- Crea un método que reciba una edad y retorne true si es mayor de edad
    y false en caso contrario.
 */

package ejerciciosfunciones;

public class Ejercicio06 {
    public static void main(String[] args) {
        boolean resultado = mayorOMenor(18);
        boolean resultado2 = mayorOMenor(15);
    }
    public static boolean mayorOMenor(int edad) {
        if(edad >= 18) {
            System.out.println("El usuario es mayor de edad");
            return true;
        }
        System.out.println("El usuario es menor de edad");
        return false;
    }
}
/*
Solución proporcionada por Mouredev:

        // 6. Crea un mÃ©todo que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        boolean isAdult1 = isAdult(17);
        boolean isAdult2 = isAdult(25);
        System.out.println("Â¿Es mayor de edad (17 aÃ±os)? " + isAdult1);
        System.out.println("Â¿Es mayor de edad (25 aÃ±os)? " + isAdult2);

            // 6. FunciÃ³n que verifica si es mayor de edad
        public static boolean isAdult(int age) {
        return age >= 18;
    }

 */
