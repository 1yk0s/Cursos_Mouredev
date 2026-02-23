/*
10.- Dado un Array, transfórmalo en ArrayList, a continuación en un HashSet
    y finalmente en un HashMap con clave y valor iguales
 */

package ejerciciosestructurasdedatos;

import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Declaración e inicialización de Array:
        String[] nombres = {"Kevin", "Vicky"};
        System.out.println(nombres);
        //Conversión a ArrayList
        ArrayList<String> listaNombres = new ArrayList<String>();
        Collections.addAll(listaNombres, nombres);
        System.out.println(listaNombres);
        //Conversión a HashSet
        HashSet<String> listaHash = new HashSet<String>(listaNombres);
        System.out.println(listaHash);
        //Conversión a HashMap
        HashMap<String, String> listaMap = new HashMap<String, String>();
        for (String clave : listaHash) {
            listaMap.put(clave, clave);
        }
        System.out.println(listaMap);

    }
}
/*
Solución proporcionada por Mouredev:

       // 10. Dado un Array, transfÃ³rmalo en un ArrayList, a continuaciÃ³n en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        // Array inicial
        String[] languages = { "Java", "Python", "JavaScript", "Java", "Kotlin", "Python" };
        System.out.println("Array original: " + java.util.Arrays.toString(languages));

        // Array a ArrayList
        ArrayList<String> languagesList = new ArrayList<>();
        for (String language : languages) {
            languagesList.add(language);
        }
        System.out.println("ArrayList: " + languagesList);
        System.out.println("TamaÃ±o ArrayList: " + languagesList.size());

        // ArrayList a HashSet (elimina duplicados)
        HashSet<String> languagesSet = new HashSet<>(languagesList);
        System.out.println("HashSet (sin duplicados): " + languagesSet);
        System.out.println("TamaÃ±o HashSet: " + languagesSet.size());

        // HashSet a HashMap (clave y valor iguales)
        HashMap<String, String> languagesMap = new HashMap<>();
        for (String language : languagesSet) {
            languagesMap.put(language, language);
        }
        System.out.println("HashMap (clave = valor): " + languagesMap);
        System.out.println("TamaÃ±o HashMap: " + languagesMap.size());

        // Ejemplos adicionales de operaciones
        System.out.println("\n=== OPERACIONES ADICIONALES ===");

        // Verificar si contiene elementos
        System.out.println("Â¿El ArrayList contiene 'Java'? " + languagesList.contains("Java"));
        System.out.println("Â¿El HashSet contiene 'PHP'? " + languagesSet.contains("PHP"));
        System.out.println("Â¿El HashMap contiene la clave 'Python'? " + languagesMap.containsKey("Python"));

        // Obtener valores
        System.out.println("Primer elemento del ArrayList: " + languagesList.getFirst());
        System.out.println("Ãšltimo elemento del ArrayList: " + languagesList.getLast());
        System.out.println("Valor de 'Java' en el HashMap: " + languagesMap.get("Java"));

        // Verificar si estÃ¡n vacÃ­os
        System.out.println("Â¿EstÃ¡ vacÃ­o el ArrayList? " + languagesList.isEmpty());
        System.out.println("Â¿EstÃ¡ vacÃ­o el HashSet? " + languagesSet.isEmpty());
        System.out.println("Â¿EstÃ¡ vacÃ­o el HashMap? " + languagesMap.isEmpty());
    }
 */
