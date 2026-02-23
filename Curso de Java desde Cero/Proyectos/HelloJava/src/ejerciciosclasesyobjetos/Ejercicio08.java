/*
08.- Crea la clase Worker que reciba nombre y salario, y un método para
    mostrar el salario.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio08 {
    public static void main(String[] args) {

        Worker trabajador = new Worker("Kevin", 1250);
        trabajador.mostrarSalario();
    }
}
/*
Solución por Mouredev:

        // 8. Crea una clase Worker que reciba nombre y salario, y un mÃ©todo para
        // mostrar su salario.
        Worker worker1 = new Worker("Brais Moure", 2500.0);
        worker1.showSalary();

// 8. Clase Worker
class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Trabajador: " + name + ", Salario: â‚¬" + salary);
    }
}

 */