package bucles;

public class For {
    public static void main(String[] args) {

        //Bucle for

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, Java");
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Restando");
        }

        //Mostrar elementos String con bucle for contador

        String[] nombres = {"Kevin", "Alonso", "1yk0s"};

        for (int contador = 0; contador < nombres.length; contador++) {
            System.out.println(nombres[contador]);
        }

    }
}
