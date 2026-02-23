package ejerciciospolimorfismo;

public class Circle extends Shape {

    private double PI = Math.PI;
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        double area = PI*(radio*radio);
        System.out.print("El área del Círculo es: ");
        return area;
    }
}
