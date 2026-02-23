/*
02.- Usa do-while para mostrar todos los valores de un ArrayList
 */

package ejerciciosbucles;

import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        int contador = 0;

        nombres.add("Vicky");
        nombres.add("Karma");
        nombres.add("Panda");
        nombres.add("Kevin");

        if(!nombres.isEmpty()) {
            do {
                System.out.println("Nombre: " + nombres.get(contador));
                contador++;
            } while (contador < nombres.size());
        }
    }
}

/*
Solución de Mourev;

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("manzana");
        fruits.add("plÃ¡tano");
        fruits.add("naranja");
        fruits.add("uva");

        int index = 0;
        if (!fruits.isEmpty()) {
            do {
                System.out.println("Fruta: " + fruits.get(index));
                index++;
            } while (index < fruits.size());
        } else {
            System.out.println("El ArrayList estÃ¡ vacÃ­o");
        }
 */