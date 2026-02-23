package strings;

public class ToUpperCaseToLowerCase {
    public static void main(String[] args) {

        //Variables
        String name = "Kevin";

        //toUpperCase para transformar la cadena de texto en mayúsculas
        System.out.println(name.toUpperCase());

        //toLowerCase para transformar la cadena de texto en minúsculas
        System.out.println(name.toLowerCase());

        //Modificar el String para que sea todo mayúsculas
        name = name.toUpperCase();

        //Modificar el String para que sea todo minúsculas
        name = name.toLowerCase();

        //Vuelta al valor original

        name = "Kevin";


    }
}
