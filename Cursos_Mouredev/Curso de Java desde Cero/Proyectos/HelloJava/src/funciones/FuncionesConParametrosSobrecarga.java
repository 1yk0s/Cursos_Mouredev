package funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class FuncionesConParametrosSobrecarga {
    public static void main(String[] args) {

        //Declaración e inicialización ArrayList
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Vicky", "Karma", "Panda", "Kevin"));

        //Funciones con parámetros || sobrecarga
        sendEmailToUser("1yk0s.amar0kk@gmail.com");
        sendEmailToUser("1yk0s.amar0kk@gmail.com", "1yk0s");
        sendEmailToUser(nombres);

    }

    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía email a " + name + " ( " + email + " )");
    }

    public static void sendEmailToUser(ArrayList<String> nombres) {
        for(String nombres2 : nombres) {
            System.out.println("Nombres: " + nombres2);
        }
    }
}
