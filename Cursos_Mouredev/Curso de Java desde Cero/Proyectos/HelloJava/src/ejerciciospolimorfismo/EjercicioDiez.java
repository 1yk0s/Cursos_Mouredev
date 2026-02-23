/*
10.- Crea una clase Character con el método attack().
     Luego crea subclases Warrior, Archer, Mage con ataques diferentes.
     En la clase principal con el método main(), crea un ArrayList<> de Character
     y llama al método attack() para cada clase.
 */

package ejerciciospolimorfismo;

import java.util.ArrayList;

public class EjercicioDiez {
    public static void main(String[] args) {
        ArrayList<Character> personajes = new ArrayList<>();
        personajes.add(new Warrior());
        personajes.add(new Archer());
        personajes.add(new Mage());

        for(Character c : personajes) {
            c.attack();
        }
    }
}
/*
Solución por Mouredev:

        // 10. Crea una clase Character con mÃ©todo attack(). Luego crea subclases
        // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
        // Character y llama a attack() para cada uno.
        System.out.println("\n=== Ejercicio 10: Character con array ===");
        Character[] characters = { new Warrior(), new Archer(), new Mage() };

        for (Character character : characters) {
            character.attack();
        }

            // 10. Clases Character, Warrior, Archer y Mage
    public static abstract class Character {
        public abstract void attack();
    }

    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("El guerrero ataca con su espada");
        }
    }

    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("El arquero dispara con su arco");
        }
    }

    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("El mago lanza un hechizo");
        }
    }
 */
