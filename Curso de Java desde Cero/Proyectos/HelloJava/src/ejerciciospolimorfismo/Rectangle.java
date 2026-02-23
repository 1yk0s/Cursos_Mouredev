package ejerciciospolimorfismo;

public class Rectangle extends Shape {
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        double area = base * altura;
        System.out.print("El área del Rectángulo es: ");
        return area;
    }
}
