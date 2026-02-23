/*
07.- Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    El perímetro de un rectángulo puede ser calculado al sumar las longitudes de
    todos sus lados.
    En un rectángulo, los lados opuestos son iguales, por lo que el perímetro de un
    rectángulo es igual al doble de la longitud de la base más el doble de la longitud
    de la altura del triánulo.
    P = 2(a+b).
    El área de un rectángulo puede ser calculada multiplicando la longitud de la base
    del rectángulo por su altura.
    A = b * a.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio07 {
    public static void main(String[] args) {

        Rectangle rectangulo = new Rectangle(70, 30);
        rectangulo.calcularPerimetro();
        rectangulo.calcularArea();
    }
}
/*
Solución por Mouredev:

        // 7. Crea una clase Rectangle con mÃ©todos para calcular el Ã¡rea y el perÃ­metro.
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        rectangle1.showCalculations();

// 7. Clase Rectangle
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void showCalculations() {
        System.out.println("RectÃ¡ngulo de " + width + " x " + height);
        System.out.println("Ãrea: " + calculateArea());
        System.out.println("PerÃ­metro: " + calculatePerimeter());
    }

    private double calculateArea() {
        return width * height;
    }

    private double calculatePerimeter() {
        return 2 * (width + height);
    }
}

 */
