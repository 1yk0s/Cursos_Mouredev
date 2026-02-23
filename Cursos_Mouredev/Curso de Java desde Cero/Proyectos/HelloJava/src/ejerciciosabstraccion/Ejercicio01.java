/*
1.- Crea una clase abstracta Shape con el método calculateArea().
    Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule
    su propia Área.
    Para calcular el área del Círculo: PI * radio^2.
    Para calcular el área del Rectángulo: Base * Altura.
 */

package ejerciciosabstraccion;

public class Ejercicio01 {
    public static void main(String[] args) {
        Circle circulo = new Circle(7.3);
        Rectangle rectangulo = new Rectangle(10.34, 11.2);
        circulo.calculateArea();
        rectangulo.calculateArea();
    }
}
/*
Solución por Mouredev:

        // 1. Crea una clase abstracta Shape con el mÃ©todo calculateArea(). Luego
        // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
        // propia Ã¡rea.
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Ãrea del cÃ­rculo: " + circle.calculateArea());
        System.out.println("Ãrea del rectÃ¡ngulo: " + rectangle.calculateArea());

            // 1. Clases Shape, Circle y Reactangle
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