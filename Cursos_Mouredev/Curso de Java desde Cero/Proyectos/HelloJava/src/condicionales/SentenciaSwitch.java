package condicionales;

public class SentenciaSwitch {
    public static void main(String[] args) {

        //Sentencia Switch

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
            break;
            case 3:
                System.out.println("Miércoles");
            break;
            case 4:
                System.out.println("Jueves");
            break;
            case 5:
                System.out.println("Viernes");
            break;
            default:
                System.out.println("No es un día entresemana");
        }
    }
}
