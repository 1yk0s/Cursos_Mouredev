package ejerciciosclasesyobjetos;

public class Student {

    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public boolean aprobadoSuspenso() {
        boolean resultado;
        System.out.println("El alumno: " + name);
        System.out.println("¿Ha aprobado?: ");
        if (score >= 60) {
            System.out.println("Ha aprobado");
            resultado = true;
        } else {
            System.out.println("Ha suspendido");
            resultado = false;
        }
        return resultado;
    }

}
