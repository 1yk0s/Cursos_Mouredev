package strings;

public class Equals {
    public static void main(String[] args) {
        String name = "Kevin";
        System.out.println(name == "Kevin");
        System.out.println(name.equals("Kevin"));

        //metodo equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("KEVIN"));
        System.out.println(name.equalsIgnoreCase("kevin"));
        System.out.println(name.equalsIgnoreCase("KeVIn"));

        // == vs .equals
        var a = "Kevin"; //variable con cadena de texto.
        var b = "Kevin"; //variable con cadena de texto.
        var c = new String("Kevin"); //nuevo objeto con la cadena de texto

        System.out.println(a == b); //true
        System.out.println(a == c); //false, compara la variable con un nuevo objeto
        System.out.println(a.equals(c));//true, compara el contenido, aunque sea un objeto diferente.
    }
}
