package ejerciciosabstraccion;

public class Rectangle extends Shape {
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculateArea() {
        double area = base * altura;
        System.out.println("--- ÁREA DEL RECTÁNGULO --- ");
        System.out.printf("El Área del Rectángulo es : %.2f", area);
        System.out.println();
    }
}
