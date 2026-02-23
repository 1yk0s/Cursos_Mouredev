package ejerciciosinheritance;

public class Circle extends Shape {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calculateArea() {
        System.out.println("El área de un círculo es: " + Math.PI + " multiplicado por " +
                " el radio al cuadrado");
        return Math.PI * (radio*radio);
    }
}
