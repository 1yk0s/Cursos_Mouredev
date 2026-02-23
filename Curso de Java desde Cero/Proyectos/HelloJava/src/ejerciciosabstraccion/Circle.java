package ejerciciosabstraccion;

public class Circle extends Shape {
    private double PI = Math.PI;
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculateArea() {
        double area = (PI * (radio*radio));
        System.out.println("--- AREA DEL CÍRCULO ---");
        System.out.printf("El área del círculo es: %.2f", area);
        System.out.println("\n");
    }
}
