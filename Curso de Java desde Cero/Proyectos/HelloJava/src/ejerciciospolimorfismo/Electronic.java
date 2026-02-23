package ejerciciospolimorfismo;

public class Electronic extends Product {


    public Electronic(double importe) {
        super(importe);
    }

    @Override
    public void getPrice() {
        System.out.println("--- PRECIO ORIGINAL ---");
        System.out.println("IMPORTE ELECTRONIC: " + getImporte());
        System.out.println("--- PRECIO CON UN DESCUENTO DE 30% DE DESCUENTO ---");
        double precioFinal = (getImporte() / 1.30);
        System.out.printf("El precio final es: %.2f", precioFinal);
        System.out.println();
    }
}
