/*
10.- Implementa una clase LoginSystem que use una excepción personalizada
     LoginFailedException si el usuario o contraseña son incorrectos.
 */

package ejerciciosexcepciones;

public class Ejercicio10 {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem("1yk0s", "Amar0k");

        try {
            login.checkUser("1yk0s", "Amar0k");
        } catch (Credenciales c) {
            System.out.println("ERROR EN CREDENCIALES");
        }
    }
}

/*
Solución por Mouredev:

    // 10. Sistema de login con excepciÃ³n personalizada
    public static class LoginSystem {
        private final String validUser = "admin";
        private final String validPassword = "password123";

        public void login(String username, String password) throws LoginFailedException {
            if (!username.equals(validUser) || !password.equals(validPassword)) {
                throw new LoginFailedException("Usuario o contraseÃ±a incorrectos");
            } else {
                System.out.println("Login exitoso para el usuario: " + username);
            }
        }
    }

// 10. ExcepciÃ³n personalizada para login
    public static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
        }
    }
 */