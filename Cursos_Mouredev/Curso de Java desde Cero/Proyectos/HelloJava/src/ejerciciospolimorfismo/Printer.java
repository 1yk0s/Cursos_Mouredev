package ejerciciospolimorfismo;

public class Printer {

    public Printer() {

    }

    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    public void print(int numero1, int numero2) {
        System.out.println("Se sumarán los números " + numero1 + " y el número " + numero2);
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);

    }
    public void print(double numero1, double numero2) {
        System.out.println("Se multiplicarán los números " + numero1 + " y el número " + numero2);
        double resultado = numero1 * numero2;
        System.out.println("El resultado es: " + resultado);
    }

}
