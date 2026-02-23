/*
6.- Crea una clae Notificacion con método send().
    Posteriormente las subclases, EmailNotification, SMSNotification.
    Para finalizar, crea una función, sendNotification(Notification n) que reciba
    cualquier tipo y lo ejecute.
 */

package ejerciciospolimorfismo;

public class EjercicioSeis {
    public static void main(String[] args) {
        sendNotification(new Notification());
        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());
    }

    public static void sendNotification(Notification n) {
        n.send();
    }
}
/*
Solución por Mouredev:

        // 6. Crea una clase Notification con mÃ©todo send(), y subclases
        // EmailNotification, SMSNotification. Luego crea una funciÃ³n
        // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());

            // 6. Clases Notification, EmailNotification y SMSNotification
    public static class Notification {
        public void send() {
            System.out.println("Enviando notificaciÃ³n");
        }
    }

    public static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando notificaciÃ³n por email");
        }
    }

    public static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Enviando notificaciÃ³n por SMS");
        }
    }

    // FunciÃ³n para el ejercicio 6
    public static void sendNotification(Notification notification) {
        notification.send();
    }
 */