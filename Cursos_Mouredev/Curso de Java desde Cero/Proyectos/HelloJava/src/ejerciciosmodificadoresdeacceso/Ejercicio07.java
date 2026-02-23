/*
07.- Crea una clase Employee con el atributo privado salary.
     Agrega el método raiseSalary(double percent) que solo permita
     aumentos positivos.
     raiseSalary => aumentar salario.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio07 {
    public static void main(String[] args) {
        Employee empleado = new Employee("1yk0s", 1200);
        System.out.println("Sueldo actual: " + empleado.getSalary());
        System.out.println("Aumento de un 30%: " + empleado.raiseSalary(30));
        System.out.println("Sueldo con aumento: " + empleado.getSalary());
    }
}
/*
Solución por Mouredev:

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el mÃ©todo
        // raiseSalary(double percent) que solo permita aumentos positivos.
        EmployeeExample emp1 = new EmployeeExample("Brais Moure", 2500.0);
        emp1.showInfo();
        emp1.raiseSalary(10.0);
        emp1.showInfo();
        emp1.raiseSalary(-5.0);

        // 7. Clase EmployeeExample
    class EmployeeExample {
    private String name;
    private double salary;

    public EmployeeExample(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increase = salary * (percent / 100);
            salary += increase;
            System.out.println("Salario aumentado en " + percent + "%. Nuevo salario: â‚¬" + salary);
        } else {
            System.out.println("El porcentaje de aumento debe ser positivo");
        }
    }

    public void showInfo() {
        System.out.println("Empleado: " + name + ", Salario: â‚¬" + salary);
    }
}



 */