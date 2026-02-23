package strings;

public class CharAt {

    public static void main(String[] args) {

        //Variables
        String name = "Kevin";

        //Obtener caracter en una posición del String
        System.out.println(name.charAt(2));

        //Obtener la última posición del String mediante la longitud menos 1.
        System.out.println(name.charAt(name.length() -1));
    }
}
