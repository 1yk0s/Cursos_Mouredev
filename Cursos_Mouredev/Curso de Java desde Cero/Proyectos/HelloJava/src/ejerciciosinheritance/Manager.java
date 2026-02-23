package ejerciciosinheritance;

public class Manager extends Employee {
    private int department;


    public Manager(String name, double salary, int department) {
        super(name, salary);
        this.department = department;
    }

    public int getDepartment() {
        return  department;
    }

    public int setDepartment(int department) {
        this.department = department;
        return department;
    }


}
