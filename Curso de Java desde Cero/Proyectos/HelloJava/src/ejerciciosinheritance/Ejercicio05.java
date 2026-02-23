/*
05.- Crea una clase abstrata Shape con un método calculateArea().
     Luego implementa este método en Circle y Rectangle.
     Shape => Forma.
 */

package ejerciciosinheritance;

public class Ejercicio05 {
    public static void main(String [] args) {

        Rectangle rectangulo = new Rectangle(70, 25);
        Circle circulo = new Circle(13);
        rectangulo.calculateArea();
        circulo.calculateArea();

    }
}
/*
Solución por Mouredev:

        // 5. Crea una clase abstracta Shape con un mÃ©todo calculateArea(). Luego
        // implementa ese mÃ©todo en Circle y Rectangle.
        Circle circle = new Circle(5.0);
        System.out.println("Ãrea del cÃ­rculo: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Ãrea del rectÃ¡ngulo: " + rectangle.calculateArea());

            // 5. Clases Shape, Circle y Rectangle
    public static abstract class Shape {
        public abstract double calculateArea();
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

 */
