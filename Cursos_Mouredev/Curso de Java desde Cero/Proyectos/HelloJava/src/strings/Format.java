package strings;

public class Format {
    public static void main(String[] args) {

        //format => para formatear cadenas de texto
        String name = "Kevin";
        int age = 31;

        System.out.println(String.format("Hola, mi nombre es %s, tengo %d años", name, age));

        /*
        Cadenas de texto => %s
        Números enteros => %d
        Números decimales => %f
        Caracteres => %c
        Valores booleanos => %b
         */
    }
}
