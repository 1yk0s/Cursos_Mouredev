package ejerciciospolimorfismo;

public class Book extends Product {
    public Book(double importe) {
        super(importe);
    }


    @Override
    public void getPrice() {
        System.out.println("--- PRECIO ORIGINAL DE LIBRO ---" + getImporte());
        System.out.println("--- PRECIO CON 20% DE DESCUENTO ---");
        double precioFinal = (getImporte() / 1.20);
        System.out.printf("PRECIO FINAL : %.2f", precioFinal);
    }
}

