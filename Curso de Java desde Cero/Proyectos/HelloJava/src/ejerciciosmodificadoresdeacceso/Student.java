package ejerciciosmodificadoresdeacceso;

public class Student {
    private String name;
    private int grade;

    public Student() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("La nota debe de estar entre 1 y 100");
        }
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassed() {
        if(grade >= 60) {
            System.out.println("El alumno ha apobrado, nota: " + grade);
            return true;
        } else {
            System.out.println("Suspenso, se necesitan mínimo 60 puntos, nota: " + grade);
            return false;
        }
    }
}
