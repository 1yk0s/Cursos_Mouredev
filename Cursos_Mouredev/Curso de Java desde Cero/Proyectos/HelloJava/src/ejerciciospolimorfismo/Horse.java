package ejerciciospolimorfismo;

public class Horse extends Animal {

    public Horse(String nombre) {
        super(nombre);
    }

    @Override
    public void getType() {
        System.out.println("El anumal es un Caballo");
    }

}
