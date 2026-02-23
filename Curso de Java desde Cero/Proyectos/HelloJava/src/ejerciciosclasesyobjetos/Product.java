package ejerciciosclasesyobjetos;

public class Product {

    String nombre;
    double precio;

    public Product (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void descuentoTreinta() {
        double descuento;
        descuento = precio * 0.30;
        System.out.println("El precio final es: " + (precio - descuento));

    }
}
