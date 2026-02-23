/*
2. Crea una clase Shape(Forma) con el método calculateArea().
   Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
   Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
 */

package ejerciciospolimorfismo;

import java.util.ArrayList;

public class EjercicioDos {
    public static void main(String args[]) {

        ArrayList<Shape> lista = new ArrayList<>();
        lista.add(new Circle(5));
        lista.add(new Rectangle(7, 8));

        for(Shape s : lista) {
            System.out.println(s.calculateArea());
        }
    }
}

/*
Solución por Mouredev:

        // 2. Crea una clase Shape con el mÃ©todo calculateArea(). Luego implementa
        // subclases Circle y Rectangle con sus propias fÃ³rmulas. Usa una lista de Shape
        // para recorrer e imprimir el Ã¡rea de varias figuras.
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Circle(3.0));

        for (Shape shape : shapes) {
            System.out.println("Ãrea: " + shape.calculateArea());
        }


        // 2. Clases Shape, Circle y Reactangle
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