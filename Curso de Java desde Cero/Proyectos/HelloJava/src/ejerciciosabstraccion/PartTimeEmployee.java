package ejerciciosabstraccion;

public class PartTimeEmployee extends Employee{
    private double salarioHora;

    public PartTimeEmployee(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public void calculateSalary() {
        double salario = salarioHora * 20;
        System.out.printf("\nSalario de empleado a media jornada: %.2f", salario);
    }
}
