package ejerciciosabstraccion;

public class Car extends Move implements Move.Movable {

    @Override
    public void move() {
        System.out.println("El coche arranca y se mueve");
    }

}
