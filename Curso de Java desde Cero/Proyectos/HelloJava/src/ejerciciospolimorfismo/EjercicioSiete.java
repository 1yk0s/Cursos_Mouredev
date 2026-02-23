/*
7.- Crea una función showAnimalType(Animal animal) que imprima el tipo de
    animal.
    Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo
    con su propio getType() sobrescrito.
 */

package ejerciciospolimorfismo;

public class EjercicioSiete {
    public static void main(String[] args) {
        showAnimalType(new Dog("Perro"));
        showAnimalType(new Cat("Gato"));
        showAnimalType(new Horse("Caballo"));

    }

    public static void showAnimalType(Animal animal) {
        animal.getType();
    }
}

/*
Solución por Mouredev:

        // 7. Crea una funciÃ³n showAnimalType(Animal animal) que imprima el tipo de
        // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
        // su tipo con su propio getType() sobrescrito.
        showAnimalType(new DogType());
        showAnimalType(new CatType());
        showAnimalType(new HorseType());

            // 7. Clases AnimalType, DogType, CatType y HorseType
    public static abstract class AnimalType {
        public abstract String getType();
    }

    public static class DogType extends AnimalType {
        @Override
        public String getType() {
            return "Perro";
        }
    }

    public static class CatType extends AnimalType {
        @Override
        public String getType() {
            return "Gato";
        }
    }

    public static class HorseType extends AnimalType {
        @Override
        public String getType() {
            return "Caballo";
        }
    }

    // FunciÃ³n para el ejercicio 7
    public static void showAnimalType(AnimalType animal) {
        System.out.println("Tipo de animal: " + animal.getType());
    }
 */
