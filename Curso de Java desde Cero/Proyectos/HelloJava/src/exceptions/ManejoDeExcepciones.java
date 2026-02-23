package exceptions;

import javax.swing.plaf.basic.BasicTreeUI;

public class ManejoDeExcepciones {
    //Manejo de Excepciones

    public static void main(String[]args) throws CustomException {
        //try-catch
        try {
            var resultado = 10 / 0;
            System.out.println(resultado);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        //try con múltiples catch
        try {
            var resultado = 10 / 0;
            System.out.println(resultado);
            var name = "Lykos";
            name = null;
            System.out.println("Nombre: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Se ha dividido algo que no debería " + e);
        } catch (NullPointerException c) {
            System.out.println("Alguno de los objetos es null: " + c.getMessage());
        } catch (Exception d) {
            System.out.println("Se ha producido una excepción no esperada");
        }
        //Finally (se ejecuta siempre).
         finally {
            System.out.println("Ha finalizado el bloque Try-catch");
        }

        //throw
        var throwExample = new ThrowableExample();
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        //Excepción personalizada
        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }


        System.out.println("Fin del programa");
    }
}
