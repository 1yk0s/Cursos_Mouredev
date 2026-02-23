package estructurasdedatos;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {

        //Declaración y creación
        HashSet<String> names = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();

        //Añadir elementos
        names.add("Kevin");
        names.add("Alonso");
        names.add("1yk0s");

        //Buscar elementos
        System.out.println(names.contains("Kevin")); //true
        System.out.println(names.contains("1yk0s.amar0kk@gmail.com")); //false

        //Eliminar elementos
        names.remove("1yk0s");
        System.out.println(names.size()); // 2

        //Trabajo con conjuntos (por encima)

        // numbers.add(names); //Error de compilación por incompatibilidad

        HashSet<String> countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        names.addAll(countries);
        System.out.println(names); //[Kevin, Argentina, Alonso, España, México]


        //Eliminar conjunto de otro conjunto

        countries.add("Kevin");
        names.removeAll(countries);
        System.out.println(names);

        //Elementos comunes.

        names.retainAll(countries);



    }
}
