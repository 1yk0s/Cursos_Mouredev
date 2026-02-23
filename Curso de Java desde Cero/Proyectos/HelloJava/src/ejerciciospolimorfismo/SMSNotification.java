package ejerciciospolimorfismo;

public class SMSNotification extends Notification {

    public SMSNotification() {

    }

    @Override
    public void send() {
        System.out.println("Enviada notificación vía SMS");
    }
}
