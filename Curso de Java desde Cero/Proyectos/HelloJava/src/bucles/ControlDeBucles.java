package bucles;

public class ControlDeBucles {

    //Control de bucles

    //Sentencia break
    /*
    Se crea un Array de nombres "names"
    y se utiliza el bucle for each para recorrerlo.
    En el momento que se encuentra el valor "1yk0s",

     */

    public static void main(String[] args) {

        String[] names = {"Kevin", "1yk0s", "Alonso"};

        for (String names2 : names) {
            if (names2.equals("1yk0s")) {
                break;
            }
            System.out.println(names2);
        }

    }
}
