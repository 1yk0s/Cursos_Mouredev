package extras;

import programacionorientadaaobjetos.Clases;
import programacionorientadaaobjetos.Person;

import java.util.Scanner;
//import programacionroeitnadaaobjetos.*;

public class Extras {

    static String globalName = "1yk0s";

    public static void main(String[] args) {

        //Extras
        String globalName = "1yk0s";

        //Null
        String name = "1yk0s";
        name = null;
        if(name != null) {
            System.out.println(name.toLowerCase());
        }

        //import
        Person persona = new Person("1yk0s", 32);
        Clases clases = new Clases();

        //Scanner

            //var age = 18;
            // System.out.println("La edad es: " + age);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        var age = teclado.nextInt();

        //Scope: Variables locales y globales

        test();


    }

    public static void test() {
        System.out.println(globalName);
    }

}
