/*
5.- Crea una clase abstracta Employee con un método calculateSalary().
    Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente
    para calcular el salario.
 */

package ejerciciosabstraccion;

public class Ejercicio05 {
    public static void main(String[] args) {
        Employee[] empleados = {new FullTimeEmployee(45.23), new PartTimeEmployee(45.23)};
        for(Employee e : empleados) {
            e.calculateSalary();
        }
    }
}
/*
Solución por Mouredev:

       // 5. Crea una clase abstracta Employee con un mÃ©todo calculateSalary().
        // Implementa FullTimeEmployee y PartTimeEmployee con lÃ³gica diferente para
        // calcular el salario.
        Employee fullTime = new FullTimeEmployee(3000.0);
        Employee partTime = new PartTimeEmployee(20, 15.0);
        System.out.println("Salario empleado tiempo completo: $" + fullTime.calculateSalary());
        System.out.println("Salario empleado medio tiempo: $" + partTime.calculateSalary());

            // 5. Clases Employee, FullTimeEmployee y PartTimeEmployee
    public static abstract class Employee {
        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }
    }

    public static class PartTimeEmployee extends Employee {
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(int hoursWorked, double hourlyRate) {
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }
 */