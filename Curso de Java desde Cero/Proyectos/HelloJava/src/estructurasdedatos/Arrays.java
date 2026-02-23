package estructurasdedatos;

public class Arrays {
    public static void main(String[] args) {
        //Arrays
        int[] number = new int[3];
        System.out.println(number.length); //Longitud de la lista

        String[] names = {"Kevin", "Alonso", "1yk0s"};
        System.out.println(names);

        //Acceso a los datos
        System.out.println(names[0]); //Kevin
        System.out.println(number[0]); //0

        System.out.println((new String[3])[0]); //null

        //Modificacion de datos
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        //number[3] = 4; Error.

        System.out.println(names[2]); //1yk0s
        names[2] = "Morán";
        System.out.println(names[2]); //Morán

        //Eliminar datos

        System.out.println(names[2]); //Morán
        names[2] = null;
        System.out.println(names[2]); //null

        System.out.println(names.length); //3

        // number[2] = null; Error.

        boolean[] booleanos = new boolean[5];
        System.out.println(booleanos[4]); //false
    }
}
