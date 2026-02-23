/*
07.- Haz una clase Device con un constructor que imprima "Device Created".
     Luego crea Phone que herede de Device y en su constructor imprima
     "Phone Ready".
 */

package ejerciciosinheritance;

public class Ejercicio07 {
    public static void main(String[] args) {
        Device dispositivo = new Device();
        Phone iphone = new Phone();

    }
}
/*
Solución por Mouredev:

       // 7. Haz una clase Device con un constructor que imprima â€œDevice createdâ€.
        // Luego crea Phone que herede de Device y en su constructor imprima â€œPhone
        // readyâ€.
        Device device = new Device();
        Phone phone = new Phone();

            // 7. Clases Device y Phone
    public static class Device {
        public Device() {
            System.out.println("Device created");
        }
    }

    public static class Phone extends Device {
        public Phone() {
            super();
            System.out.println("Phone ready");
        }
    }
 */
