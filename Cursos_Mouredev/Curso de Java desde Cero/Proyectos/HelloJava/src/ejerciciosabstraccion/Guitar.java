package ejerciciosabstraccion;

public class Guitar implements Ejercicio02.Playable {
    @Override
    public void play() {
        System.out.println("EL usuario toca la guitarra");
    }

}
