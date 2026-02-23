package ejerciciosinheritance;

public class Student extends Person {

    private double calificacion;

    public Student(String name, int age, double calificacion) {
        super(name, age);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        System.out.println("La calificación es de " + calificacion + " de 100 puntos");
        return calificacion;
    }

    public void study() {
        System.out.println("Estududiando . . .");
    }
}
