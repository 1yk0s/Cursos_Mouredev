package funciones;

public class FuncionesSinParametrosNiRetorno {
    public static void main(String[] args) {

        // Funciones sin parámetros ni retorno

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }
    }


    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

}


