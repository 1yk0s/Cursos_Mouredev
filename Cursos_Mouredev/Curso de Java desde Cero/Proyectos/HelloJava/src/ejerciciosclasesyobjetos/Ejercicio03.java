/*
03.- Añade un constructor a la clase libro que recibe title y author.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio03 {
    public static void main(String[] args) {

        Book libro2 = new Book("Interfaces Gráficas", "Fco. Javier Ceballos");
        System.out.println("Título de libro2: ".concat(libro2.title));
        System.out.println("Autor de libro2: ".concat(libro2.author));
        //O así:
        System.out.println();
        libro2.mostrarDatos();
    }
}

/*
Solución proporcionada por Mouredev:

       // 3. AÃ±ade un constructor a la clase Book que reciba title y author.
        Book book2 = new Book("1984", "George Orwell");
        book2.showInfo();

 */