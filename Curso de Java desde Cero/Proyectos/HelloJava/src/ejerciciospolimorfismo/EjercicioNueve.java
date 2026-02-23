/*
9.- Crea una clase Product con el método getPrice().
    Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento.
    Recorre una lista de Product e imprime el precio final de cada uno.
 */

package ejerciciospolimorfismo;

import java.util.ArrayList;

public class EjercicioNueve {
    public static void main(String[] args) {
        ArrayList<Product> productos = new ArrayList<>();
        productos.add(new Electronic(120.78));
        productos.add(new Book(32.30));

        for(Product p : productos) {
            p.getPrice();
        }
    }
}
/*
Solución por Mouredev:

        // 9. Crea una clase Product con el mÃ©todo getPrice(). Luego, Book y Electronic
        // deben sobrescribirlo con su propia lÃ³gica de descuento. Recorre una lista de
        // Product e imprime el precio final de cada uno.
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Book(25.0));
        products.add(new Electronic(150.0));
        products.add(new Book(30.0));

            // 9. Clases Product, Book y Electronic
    public static class Product {
        protected double basePrice;

        public Product(double basePrice) {
            this.basePrice = basePrice;
        }

        public double getPrice() {
            return basePrice;
        }
    }

    public static class Book extends Product {
        public Book(double basePrice) {
            super(basePrice);
        }

        @Override
        public double getPrice() {
            // Descuento del 10% para libros
            return basePrice * 0.9;
        }
    }

    public static class Electronic extends Product {
        public Electronic(double basePrice) {
            super(basePrice);
        }
 */