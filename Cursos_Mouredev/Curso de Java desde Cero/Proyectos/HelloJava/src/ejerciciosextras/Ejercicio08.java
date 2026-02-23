/*

 */

package ejerciciosextras;

class DocumentedClass {
    private String info;

    public DocumentedClass() {
        this.info = "Información de ejemplo";
    }

    public void showInfo() {
        System.out.println("Info desde la clase documentada: " + info);
    }
}

public class Ejercicio08 {
    public static void main(String[] args) {
        DocumentedClass claseDocumentada = new DocumentedClass();
        claseDocumentada.showInfo();
    }
}
