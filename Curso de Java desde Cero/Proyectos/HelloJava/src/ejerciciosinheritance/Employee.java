package ejerciciosinheritance;

public class Employee {
    private String name;
    private double salary;

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

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
}
