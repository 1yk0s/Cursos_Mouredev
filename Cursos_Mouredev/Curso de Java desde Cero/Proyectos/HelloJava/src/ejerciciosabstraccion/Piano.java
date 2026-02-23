package ejerciciosabstraccion;

public class Piano implements Ejercicio02.Playable {
    @Override
    public void play() {
        System.out.println("EL usuario toca el Piano");
    }
}
