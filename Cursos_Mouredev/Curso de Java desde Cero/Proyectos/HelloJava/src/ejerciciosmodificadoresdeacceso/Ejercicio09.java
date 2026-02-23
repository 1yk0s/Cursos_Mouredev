/*
09.- Crea una clase Student con el atributo privado grade.
     Agrega los métodos setGrade(int grade) y isPassed() que retorne
     true si la nota es mayor o igual a 60.
     grade => Calificación.
     passed => aprobado.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio09 {
    public static void main(String[] args) {
        Student estudiante = new Student();
        estudiante.setName("1yk0s");
        estudiante.getName();
        estudiante.setGrade(60);
        estudiante.isPassed();
        estudiante.setGrade(50);
        estudiante.isPassed();
        estudiante.setGrade(90);
        estudiante.isPassed();
    }
}
/*
Solución por Mouredev:

        // 9. Crea una clase Student con el atributo privado grade. Agrega los mÃ©todos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
        // a 60.
        StudentExample student1 = new StudentExample("Brais Moure");
        student1.setGrade(85);
        System.out.println("Estudiante: " + student1.getName());
        System.out.println("Nota: " + student1.getGrade());
        System.out.println("Â¿Ha aprobado? " + student1.isPassed());

        // 9. Clase StudentExample
class StudentExample {
    private String name;
    private int grade;

    public StudentExample(String name) {
        this.name = name;
        this.grade = 0;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }

    public boolean isPassed() {
        return grade >= 60;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
 */