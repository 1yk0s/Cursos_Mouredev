/*
05.- Crea una clase Student con atributo score y un método que diga si aprobó.
     mayor o igual que 60.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio05 {
    public static void main(String[] args) {

        Student alumno = new Student("Kevin", 70);
        System.out.println("¿El alumno ha aprobado?");
        System.out.println(alumno.aprobadoSuspenso());
    }
}
/*
Solución de Mouredev:

        // 5. Crea una clase Student con atributo score y un mÃ©todo que diga si aprobÃ³
        // (mayor o igual a 60).
        Student student1 = new Student("Brais", 85);
        student1.checkPassed();

        // 5. Clase Student
class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void checkPassed() {
        if (score >= 60) {
            System.out.println(name + " ha aprobado con una nota de " + score);
        } else {
            System.out.println(name + " no ha aprobado. Nota: " + score);
        }
    }
}
 */