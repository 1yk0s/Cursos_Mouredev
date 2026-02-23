package ejerciciosclasesyobjetos;

public class Rectangle {

    double base;
    double altura;


    public Rectangle (double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    public void calcularPerimetro() {
        double resultado;
        resultado = 2*(base*altura);
        System.out.println("El perímetro es: " + resultado);
    }

    public void calcularArea() {
        double resultado;
        resultado = base * altura;
        System.out.println("El área es: " + resultado);
    }
}
