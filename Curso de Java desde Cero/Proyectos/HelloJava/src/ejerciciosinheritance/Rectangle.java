package ejerciciosinheritance;

public class Rectangle extends Shape {
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calculateArea() {
        System.out.println("El área del rectángulo es la base: " + base + " por la altura " + altura);
        double resultado = base * altura;
        return resultado;
    }
}
