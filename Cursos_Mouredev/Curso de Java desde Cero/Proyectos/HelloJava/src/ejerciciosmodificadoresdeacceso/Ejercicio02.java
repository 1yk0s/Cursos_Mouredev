/*
02.- Crea una clase Product con el atributo privado price.
    Añade el método setPrice(double price) que solo permita precios
    mayores a 0.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio02 {
    public static void main(String[] args) {

        Product producto = new Product("iPad");
        producto.setPrice(0);
        producto.setPrice(1225);
        System.out.println("El pecio del producto " + producto.getName() + " es: " +
                            producto.getPrice());

    }
}
/*
Solución por Mouredev:

        // 2. Crea una clase Product con el atributo privado price. AÃ±ade el mÃ©todo
        // setPrice(double price) que solo permita precios mayores a 0.
        ProductExample product1 = new ProductExample("Teclado");
        product1.setPrice(199.99);
        System.out.println("Precio vÃ¡lido: â‚¬" + product1.getPrice());
        product1.setPrice(-50.0);

        // 2. Clase ProductExample
    class ProductExample {
    private String name;
    private double price;

    public ProductExample(String name) {
        this.name = name;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Precio actualizado a: â‚¬" + price);
        } else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    public double getPrice() {
        return price;
    }
}
 */