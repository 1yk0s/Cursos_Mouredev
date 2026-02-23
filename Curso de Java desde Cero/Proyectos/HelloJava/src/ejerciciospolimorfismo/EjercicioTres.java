/*
3. Crea una clase Printer con varios métodos print() sobrecargados
   que acepten distintos tipos de parámetros (String, int, double).
   Llama a cada uno desde main.
 */

package ejerciciospolimorfismo;

public class EjercicioTres {

    public static void main(String[] args) {
        Printer imprimir = new Printer();
        imprimir.print("Hola");
        imprimir.print(3, 7);
        imprimir.print(12.5, 7.9);
    }
}

/*
Solución por Mouredev:

// 3. Crea una clase Printer con varios mÃ©todos print() sobrecargados que
        // acepten diferentes tipos de parÃ¡metros (String, int, double). Llama a cada
        // uno desde main.
        Printer printer = new Printer();
        printer.print("Hola, Java!");
        printer.print(42);
        printer.print(3.14);

            // 3. Clase Printer
    public static class Printer {
        public void print(String text) {
            System.out.println("Imprimiendo texto: " + text);
        }

        public void print(int number) {
            System.out.println("Imprimiendo nÃºmero entero: " + number);
        }

        public void print(double number) {
            System.out.println("Imprimiendo nÃºmero decimal: " + number);
        }
    }
 */