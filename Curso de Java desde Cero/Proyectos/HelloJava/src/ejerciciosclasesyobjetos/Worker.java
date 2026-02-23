package ejerciciosclasesyobjetos;

public class Worker {
    String nombre;
    double salario;

    public Worker (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("El salario de " + nombre + " es: " + salario);
    }

}
