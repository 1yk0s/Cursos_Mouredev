package ejerciciosabstraccion;

public class Robot extends Move implements Move.Movable {

    @Override
    public void move() {
        System.out.println("El robot mueve sus extremidades");
    }

}
