package ejerciciospolimorfismo;

public class Product {

    private double importe;

    public Product(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public void getPrice() {
        System.out.println("El precio del producto es: " + importe);
    }
}
