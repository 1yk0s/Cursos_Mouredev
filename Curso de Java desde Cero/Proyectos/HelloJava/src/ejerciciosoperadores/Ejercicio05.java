/*
Utiliza el operador lógico AND &&
 */

package ejerciciosoperadores;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Variables
        int a = 3;
        int b = 4;
        int c = 3;
        int d = 4;

        System.out.println("¿Las variables \"a\" y \"c\" tienen el mismo valor? " +
                " ¿Y las variables \"b\" y \"d\" tienen el mismo valor? " +
                (a == c && b == d));

    }
}

/*
Ejemplo de Mouredev:

System.out.println("\n=== OPERADOR LÃ“GICO AND (&&) ===");
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("Edad: " + age + ", Tiene licencia: " + hasLicense);
        System.out.println("Â¿Puede conducir? " + canDrive);
 */
