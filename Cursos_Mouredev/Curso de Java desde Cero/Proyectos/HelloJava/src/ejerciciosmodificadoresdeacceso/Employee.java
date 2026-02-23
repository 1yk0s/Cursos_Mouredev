package ejerciciosmodificadoresdeacceso;

public class Employee {

    private String name;
    private double salary;


    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double percent) {
        if(percent >= 1 && percent <= 100) {
            double aumento = percent / 100;
            double cantidad = aumento * salary;
            salary += cantidad;
        } else {
            System.out.println("El aumento debe de estar entre 1 y 100");
        }
        return salary;
    }
}
