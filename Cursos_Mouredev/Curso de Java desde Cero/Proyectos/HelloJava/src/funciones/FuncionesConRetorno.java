package funciones;

public class FuncionesConRetorno {


    public static void main(String[] args) {

        boolean respuesta = sendEmailWithState();
        System.out.println(respuesta);
        boolean respuesta2 = sendEmailWithState("1yk0s.amar0kk@gmail.com");
        System.out.println(respuesta2);
        System.out.println(sendEmailWithState(""));


    }

    //Métodos con retorno

    public static boolean sendEmailWithState() {
        System.out.println("Se envía el email");
        return true;
    }

    //Método sobrecargado con retorno
    public static boolean sendEmailWithState(String email) {
        if(email.isEmpty()) {
            return false;
        }
        System.out.println("Se envía email a " + email);
        return true;
    }
}
