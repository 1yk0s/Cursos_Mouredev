/*
01.- Crea una clase Book con atributos title y author.
    Crea un objeto y muestra sus datos.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio01 {
    public static void main(String[] args) {

        Book libro = new Book("Java 2. Cuarta edición", "Fco. Javier Ceballos");
        libro.title = "Java 2. Cuarta edición";
        libro.author = "Fco. Javier Ceballos";
        System.out.println("El título del libro es: " + libro.title);
        System.out.println("El autor del libro es: " + libro.author);
        System.out.println("Mostrado por un método puede ser:");
        libro.mostrarDatos();

    }
}

/*
Solución por Mouredev:

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.
        Book book1 = new Book();
        book1.title = "El SeÃ±or de los Anillos";
        book1.author = "J. R. R. Tolkien";
        book1.showInfo();

// 1. y 2. Clase Book
class Book {
    String title;
    String author;

    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showInfo() {
        System.out.println("Libro: '" + title + "' por " + author);
    }
}

 */
