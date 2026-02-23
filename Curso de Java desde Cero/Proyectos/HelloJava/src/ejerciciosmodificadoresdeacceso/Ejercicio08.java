/*
08.- Crea una clase Rectangle con los atributos privados width y height.
     Agrea setters y el método calculateArea() que devuelva el resultado
     de width por height.
     El área de un rectángulo se calcula multiplicando la base por la altura.
     width => ancho
     height => altura.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio08 {
    public static void main(String[] args) {

        Rectangle rectangulo = new Rectangle(15.7, 12.3);
        System.out.println("La base del rectángulo es: " + rectangulo.getWidth());
        System.out.println("La altura del rectángulo es: " + rectangulo.getHeight());
        rectangulo.calculateArea();
    }
}
/*
Solución por Mouredev:
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el mÃ©todo calculateArea() que devuelva el resultado de width *
        // height.
        RectangleExample rect1 = new RectangleExample();
        rect1.setWidth(5.0);
        rect1.setHeight(3.0);
        System.out.println("Dimensiones: " + rect1.getWidth() + " x " + rect1.getHeight());
        System.out.println("Ãrea: " + rect1.calculateArea());

        // 8. Clase RectangleExample
class RectangleExample {
    private double width;
    private double height;

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("El ancho debe ser positivo");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("La altura debe ser positiva");
        }
    }
 */