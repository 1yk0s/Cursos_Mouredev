/*
09.- Crea una función checkPassword(String pass) que lance una excepción
     si la contraseña es demasiado corta.
 */

package ejerciciosexcepciones;

public class Ejercicio09 {
    public static void main(String[] args) {
        try {
            System.out.println("--- INTRODUCE LA CONTRASEÑA ----");
            String password = "contraseña";
            String shortPass = "pass";
            checkPassword(password);
            checkPassword(shortPass);
        } catch (Exception e) {
            System.out.println("Tipo de excepción: " + e.getClass());
        }
    }

    public static void checkPassword(String pass) throws Exception {
        if (pass.length() <= 8 ) {
            throw new Exception("La longitud de la contraseña debe ser mayor que 8 caracteres");
        } else {
            System.out.println("La longitud es correcta");
        }
    }
}

/*
Solución por Mouredev:
        // 9. Crea una funciÃ³n checkPassword(String pass) que lance una excepciÃ³n si la
        // contraseÃ±a es demasiado corta.
        try {
            checkPassword("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseÃ±a: " + e.getMessage());
        }

        try {
            checkPassword("miContraseÃ±aSegura");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseÃ±a: " + e.getMessage());
        }

            // 9. FunciÃ³n para validar contraseÃ±a
    public static void checkPassword(String password) throws IllegalArgumentException {
        if (password.length() < 8) {
            throw new IllegalArgumentException("La contraseÃ±a debe tener al menos 8 caracteres");
        } else {
            System.out.println("ContraseÃ±a vÃ¡lida");
        }
    }
 */



