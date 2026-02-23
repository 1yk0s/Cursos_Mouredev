package ejerciciosclasesyobjetos;

public class Book {
    String title;
    String author;

    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void mostrarDatos() {
        System.out.println("El título del libro es: " + this.title);
        System.out.println("El autor del libro es: " + this.author);

    }

}
