/*
10.- Crea una clase Product y un método que aplique un descuento sobre su precio.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio10 {
    public static void main(String[] args) {
        Product producto = new Product("Patatas", 1.30);
        producto.descuentoTreinta();

    }
}
/*
Solución por Mouredev:

        // 10. Crea una clase Product y un mÃ©todo que aplique un descuento sobre su
        // precio.
        Product product1 = new Product("Teclado", 199.99);
        product1.showPrice();
        product1.applyDiscount(15.0);
        product1.showPrice();

        // 10. Clase Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double discountAmount = price * (discountPercentage / 100);
            price -= discountAmount;
            System.out.println("Descuento del " + discountPercentage + "% aplicado");
        } else {
            System.out.println("El descuento debe estar entre 0 y 100%");
        }
    }

    public void showPrice() {
        System.out.println("Producto: " + name + ", Precio: â‚¬" + String.format("%.2f", price));
    }
}
 */
