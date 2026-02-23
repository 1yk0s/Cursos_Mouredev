/*
10.- Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
 */

package ejerciciosfunciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("Vicky", "Karma",
                "Panda", "Kevin"));

        System.out.println("Nombres de la lista:");
        mostrarLista(lista);

    }

    public static String mostrarLista(ArrayList<String> lista) {
        String listaCompleta = "";
        for(String lista2 : lista) {
            listaCompleta = lista2;
            System.out.println(listaCompleta);
        }
        return listaCompleta;
    }
}

/*
Solución por Mouredev:

            // 10. Crea una funciÃ³n que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("manzana");
        fruits.add("plÃ¡tano");
        fruits.add("naranja");
        fruits.add("uva");

        printArrayList(fruits);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");

        printArrayList(cities);

        // Ejemplos adicionales demostrando sobrecarga de mÃ©todos
        printInfo("Brais");
        printInfo("Moure", 28);
        printInfo("MoureDev", 38, "Ingeniero");

    // 10. FunciÃ³n que recorre y muestra un ArrayList
    public static void printArrayList(ArrayList<String> list) {
        System.out.println("Elementos del ArrayList:");
        for (String element : list) {
            System.out.println("- " + element);
        }
    }

        // Ejemplos adicionales de sobrecarga de mÃ©todos
    public static void printInfo(String name) {
        System.out.println("Nombre: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Nombre: " + name + ", Edad: " + age);
    }

    public static void printInfo(String name, int age, String profession) {
        System.out.println("Nombre: " + name + ", Edad: " + age + ", ProfesiÃ³n: " + profession);
    }
 */
