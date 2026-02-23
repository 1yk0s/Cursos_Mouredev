/*
04.- Crea una clase Book con el atributo privado title.
    Permite leerlo con el método getTitle() pero no modificarlo
    (sin setTitle()).
    El título debe asignarse solo por el constructor.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio04 {
    public static void main(String[] args) {

        Book libro = new Book("Java2");
        System.out.println("El título del libro es: " + libro.getTitle());

    }
}
/*
Solución por Mouredev:

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // mÃ©todo getTitle() pero no modificarlo (sin setTitle()). El tÃ­tulo debe
        // asignarse solo por el constructor.
        BookExample book1 = new BookExample("Reina Roja");
        System.out.println("TÃ­tulo del libro: " + book1.getTitle());
        // No hay mÃ©todo setTitle() - solo lectura

        // 4. Clase BookExample
class BookExample {
    private final String title; // Solo lectura

    public BookExample(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
 */