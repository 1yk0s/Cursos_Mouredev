/*
06.- Crea una clase Bird con el método fly().
     Luego crea Eagle que sobreescriba fly() pero también llame al método
     original con super.fly().
 */

package ejerciciosinheritance;

public class Ejercicio06 {
    public static void main(String[] args) {
        Bird pajaro = new Bird("Fénix");
        Eagle aguila = new Eagle("Dumbledore");
        System.out.println("Nombre del pájaro: " + pajaro.getName());
        System.out.println("Nombre del águila: " + aguila.getName());
        pajaro.fly();
        aguila.fly();
        aguila.originalFly();

    }
}
/*
Solución por Mouredev:

        // 6. Crea una clase Bird con el mÃ©todo fly(). Luego crea Eagle que sobrescriba
        // fly() pero tambiÃ©n llame al mÃ©todo original con super.fly().
        Bird bird = new Bird();
        bird.fly();

        Eagle eagle = new Eagle();
        eagle.fly();

    // 6. Clases Bird y Eagle
    public static class Bird {
        public void fly() {
            System.out.println("El pÃ¡jaro estÃ¡ volando");
        }
    }

    public static class Eagle extends Bird {
        @Override
        public void fly() {
            super.fly();
            System.out.println("El Ã¡guila vuela muy alto y con fuerza");
        }
    }

 */