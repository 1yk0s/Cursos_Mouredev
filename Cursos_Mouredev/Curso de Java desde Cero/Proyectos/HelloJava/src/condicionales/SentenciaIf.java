package condicionales;

public class SentenciaIf {
    public static void main(String[] args) {

        //Condicionales

        int age = 18;

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir los 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }
    }
}
