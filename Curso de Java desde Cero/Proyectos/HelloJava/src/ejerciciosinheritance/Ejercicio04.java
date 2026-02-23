/*
04.- La clase Employee tiene los atributos name y salary.
     Manager hereda de Employee y agrega el atributo department.
 */

package ejerciciosinheritance;

public class Ejercicio04 {
    public static void main(String[] args) {

        Employee empleado = new Employee("1yk0s", 1245.50);
        Manager manager = new Manager("Pepe", 1245.50, 6);
        System.out.println("Nombre de empleado: " + empleado.getName());
        System.out.println("Salario de empleado: " + empleado.getSalary());
        System.out.println("Nombre de manager: " + manager.getName());
        System.out.println("Departamento del Manager: " + manager.getDepartment());

    }
}
/*
Solución por Mouredev:

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
        // Employee y agrega el atributo department.
        Employee employee = new Employee("Brais", 3000.0);
        System.out.println("Empleado: " + employee.name + ", salario: $" + employee.salary);

        Manager manager = new Manager("MoureDev", 5000.0, "Ventas");
        System.out.println(
        "Manager: " + manager.name + ", salario: $" + manager.salary + ", departamento: " + manager.department);

            // 4. Clases Employee y Manager
    public static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {
        String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
    }
 */