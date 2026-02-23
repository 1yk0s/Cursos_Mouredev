/*
06.- Crea una clase User con los atributos privados username y password.
     Implementa los métodos setUsername(String username), setPassword(String password),
     y checkPassword(String inputPassword) que compare contraseñas.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio06 {
    public static void main(String[] args) {
        User usuario = new User();
        usuario.setUsername("1yk0s");
        usuario.setPassword("123456");
        System.out.println(usuario.checkPassword("123456"));
        System.out.println(usuario.checkPassword("123"));
    }
}
/*
Solución por Mouredev:

        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los mÃ©todos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseÃ±as.
        UserExample user1 = new UserExample();
        user1.setUsername("mouredev");
        user1.setPassword("miPassword123");
        System.out.println("Usuario: " + user1.getUsername());
        System.out.println("Â¿ContraseÃ±a correcta? " + user1.checkPassword("miPassword123"));
        System.out.println("Â¿ContraseÃ±a incorrecta? " + user1.checkPassword("password123"));

// 6. Clase UserExample
class UserExample {
    private String username;
    private String password;

    public void setUsername(String username) {
        if (username != null && username.length() >= 3) {
            this.username = username;
            System.out.println("Nombre de usuario establecido");
        } else {
            System.out.println("El nombre de usuario debe tener al menos 3 caracteres");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
            System.out.println("ContraseÃ±a establecida");
        } else {
            System.out.println("La contraseÃ±a debe tener al menos 6 caracteres");
        }
    }

    public boolean checkPassword(String inputPassword) {
        return password != null && password.equals(inputPassword);
    }

    public String getUsername() {
        return username;
    }
}
 */