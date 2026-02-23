package ejerciciosmodificadoresdeacceso;

public class Product {

    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product (String name, double price) {
        this.name = name;
        this.price = setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser menor que cero");
        }
        return price;
    }
}
