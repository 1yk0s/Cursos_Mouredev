package strings;

public class Substring {

    public static void main(String[] args) {

        //Variables
        String name = "Kevin";

        //Obtener una subcadena método .substring()
        System.out.println(name.substring(2)); //Desde el segundo caracter hasta el final.

        //Obtener una cadena indicando principio y final
        //El método substring() excluye el índice final.
        System.out.println(name.substring(2,4));
    }
}
