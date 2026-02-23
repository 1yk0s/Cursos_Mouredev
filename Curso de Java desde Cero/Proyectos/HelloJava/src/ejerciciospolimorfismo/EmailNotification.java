package ejerciciospolimorfismo;

public class EmailNotification extends Notification {

    public EmailNotification() {

    }

    @Override
    public void send() {
        System.out.println("Enviada notificación por email");
    }
}
