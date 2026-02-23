package ejerciciosabstraccion;

public class FullTimeEmployee extends Employee {
    private double salarioHora;

    public FullTimeEmployee(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public void calculateSalary() {
        double salario = salarioHora * 40;
        System.out.printf("\nSalario de empleado a jornada completa: %.2f", salario);
    }
}
/*
Solución por Mouredev:

 */