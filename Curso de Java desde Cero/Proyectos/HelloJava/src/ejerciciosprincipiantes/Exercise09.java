//Imprime el tipo de las dos variables creadas anteriormene.

package ejerciciosprincipiantes;

public class Exercise09 {
    public static void main(String[] args) {
        int b = 30;
        System.out.println("El tipo de la variable es: " + ((Object)b).getClass().getSimpleName());

    }
}

/*
Se realiza un casting a la clase Object para poder utilizar los métodos .getClass()
para obtener la clase y el método .getSimpleName() para obtener el nombre.
 */