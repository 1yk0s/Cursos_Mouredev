package ejerciciospolimorfismo;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void makeSound() {
        System.out.println("Algún sonido no característico");
    }

    public void getType() {
        System.out.println("Tipo de Animal");
    }

}

