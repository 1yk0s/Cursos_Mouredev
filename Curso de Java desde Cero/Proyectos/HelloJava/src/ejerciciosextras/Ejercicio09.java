/*
09.- Define una clase User con una constante APP_NAME, una variable global
     username y una función que imprima ambas.
 */

package ejerciciosextras;

class User {
    static final String APP_NAME = "1yk0s";
    static String username = "1yk0s Amar0k";

    public User() {
    }
}

public class Ejercicio09 {
    public static void main(String[] args) {
        imprimirAmbas();
    }

    public static void imprimirAmbas() {
        System.out.println(User.APP_NAME);
        System.out.println(User.username);
    }
}
/*
Solución por Mouredev:
        // 9. Define una clase User con una constante APP_NAME, una variable global
        // username y una funciÃ³n que imprima ambas.
        User user = new User();
        user.setUsername("mouredev");
        user.displayInfo();

            // 9. Clase User
    public static class User {

        public static final String APP_NAME = "MiApp Java";
        private String username;

        public User() {
            this.username = "usuario_default";
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void displayInfo() {
            System.out.println("AplicaciÃ³n: " + APP_NAME);
            System.out.println("Usuario: " + username);
        }
    }
 */