/*
4.- Crea una interfaz Drawable.
    Implementa las clases Circle2, Square (Círculo) y Triangle
    para que muestren cómo se dibuja cada uno usando draw().
 */

package ejerciciosabstraccion;

public class Ejercicio04 {
    public static void main(String[] args) {
        Circle2 circulo2 = new Circle2();
        Square cuadrado = new Square();
        Triangle triangulo = new Triangle();
        circulo2.draw();
        cuadrado.draw();
        triangulo.draw();
    }

    public interface Drawable {
        void draw();
    }
}
/*
Solución por Mouredev:
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
        // Triangle que muestren cÃ³mo se dibuja cada figura usando draw().
        Drawable[] drawings = { new DrawableCircle(), new DrawableSquare(), new DrawableTriangle() };
        for (Drawable drawing : drawings) {
            drawing.draw();
        }

            // 4. Interfaz Drawable y clases DrawableCircle, DrawableSquare y
    // DrawableTriangle
    public interface Drawable {
        void draw();
    }

    public static class DrawableCircle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cÃ­rculo: â—‹");
        }
    }

    public static class DrawableSquare implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado: â–¡");
        }
    }

    public static class DrawableTriangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triÃ¡ngulo: â–³");
        }
    }

 */
