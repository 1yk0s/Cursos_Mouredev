package estructurasdedatos;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        //Declaración y Creación
        ArrayList<String> nombres = new ArrayList<String>();
        var numeros = new ArrayList<Integer>(); //La interpreta como ArrayList<Integer>

        //Añadir elementos
        nombres.add("Kevin"); //método .add()
        nombres.add("Alonso");
        nombres.add("1yk0s");

        //Tamaño

        System.out.println(nombres.size());

        //Acesso a los datos

        System.out.println(nombres.get(0)); //método get()
        System.out.println(nombres.getFirst()); //método getFirst().
        System.out.println(nombres.get(1));
        System.out.println(nombres.getLast());  //método getLast().

        //Modificar los elementos

        nombres.set(2, "1yk0s.amar0kk@gmail.com");
        System.out.println(nombres.getLast());

        nombres.remove(2);
        // System.out.println(nombres.get(2)); //Error

        System.out.println(nombres.size());

        //Buscar elementos

        System.out.println(nombres.contains("Kevin"));
        System.out.println(nombres.contains("1yk0s.amar0kk@gmail.com"));

        //Limpiar el ArrayList
        nombres.clear();
        System.out.println(nombres.size());
    }
}