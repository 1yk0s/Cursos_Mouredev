package operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        //Operadores lógicos
        // Y (AND) && (Ampersand)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR) ||
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //NO (NOT) !
        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

    }
}