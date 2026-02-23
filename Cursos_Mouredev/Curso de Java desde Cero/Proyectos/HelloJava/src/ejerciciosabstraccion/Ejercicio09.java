/*
9.- Crea una clase abstracta Document con el método print().
    Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
 */

package ejerciciosabstraccion;

public class Ejercicio09 {
    public static void main(String[] args) {
        Document[] archivos = {new PDFDocument(), new WordDocument()};
        for (Document d : archivos) {
            d.print();
        }
    }
}
/*
Solución por Mouredev:
        // 9. Crea una clase abstracta Document con el mÃ©todo print(). Luego crea
        // PDFDocument y WordDocument, cada una con su forma de imprimir.
        Document pdf = new PDFDocument();
        Document word = new WordDocument();
        pdf.print();
        word.print();

            // 9. Clases Document, PDFDocument y WordDocument
    public static abstract class Document {
        public abstract void print();
    }

    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento PDF...");
        }
    }

    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento de Word...");
        }
    }
 */