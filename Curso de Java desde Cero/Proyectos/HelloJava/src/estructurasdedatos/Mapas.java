package estructurasdedatos;

import java.util.HashMap;

public class Mapas {
    public static void main(String[] args) {

        //Declaración e inicilización
        HashMap<String, String> names = new HashMap<>();
        //var names = new HashMap<String, String>();
        HashMap<Integer, String> numbers = new HashMap<>();
        //var numbers = new HashMap<Integer, String>();

        //Tamaño

        names.size();

        //Añadir datos

        names.put("Kevin", "1yk0s.amar0kk@gmail.com");
        names.put("1yk0s", "ellobodelbit@gmail.com");
        names.put("Lykos", "kevin.alonso.moran@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos

        System.out.println(names.get("1yk0s")); //ellobodelbit@gmail.com

        //Verificar elementos
        System.out.println(names.containsKey("1yk0s")); //true
        System.out.println(names.containsValue("1yk0s.amar0kk@gmail.com")); //true

        //Eliminar elementos
        System.out.println(names.remove("1yk0s")); //ellobodelbit@gmail.com
        System.out.println(names); //{Kevin=1yk0s.amar0kk@gmail.com, Lykos=kevin.alonso.moran@gmail.com}

        //Limpiar mapa
        names.clear();
        System.out.println(names); //{}

        //Otras operaciones
        names.put("1yk0s", "1yk0s.amar0kk@gmail.com");
        System.out.println(names); // {1yk0s=1yk0s.amar0kk@gmail.com}
        names.put("1yk0s", "1yk0s");
        System.out.println(names); // {1yk0s=1yk0s}

        //Modficar un valor solo si existe
        names.replace("1yk0s", "1yk0s.amar0kk@gmail.com");
        System.out.println(names); // {1yk0s=1yk0s.amar0kk@gmail.com}

        //Añadir un elemento solo si no existe
        names.putIfAbsent("Kevin", "1yk0s");
        System.out.println(names); // {Kevin=1yk0s, 1yk0s=1yk0s.amar0kk@gmail.com}

        //Comprobar si está vacío
        System.out.println(names.isEmpty()); //false

        //Comprobar los valores del mapa
        var valores = names.values();
        System.out.println(valores); //[1yk0s, 1yk0s.amar0kk@gmail.com]

        System.out.println(names.values()); //[1yk0s, 1yk0s.amar0kk@gmail.com]
    }
}
