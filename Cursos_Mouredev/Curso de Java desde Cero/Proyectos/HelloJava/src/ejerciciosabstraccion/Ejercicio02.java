/*
2.- Crea una interfaz Playable con el método play().
    Luego implementa esa interfaz en dos clases: Guitar y Piano.
    Cada una debe mostrar un mensaje diferente al ejecutarse.
 */

package ejerciciosabstraccion;

public class Ejercicio02 {
    public static void main(String[] args) {
        Guitar guitarra = new Guitar();
        Piano piano = new Piano();
        guitarra.play();
        piano.play();
    }

    public interface Playable {
        void play();
    }
}
/*
Solución por Mouredev:

        // 2. Crea una interfaz Playable con el mÃ©todo play(). Luego implementa esa
        // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
        // diferente al ejecutarse.
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();

            // 2. Interfaz Playable y clases Guitar y Piano
    public interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Tocando la guitarra: â™ª â™« â™ª");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Tocando el piano: â™« â™ª â™«");
        }
    }
 */