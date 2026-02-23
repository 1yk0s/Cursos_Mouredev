package bucles;

public class WhileDoWhile {
    public static void main(String[] args) {

        int index = 0;
        int i = 0;
        int j = 0;
        String[] nombres = {"Kevin", "Alonso", "Morán"};

        //Bucle while

        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        //Bucle while con Array
        while(i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }

        //Bucle while con array y sentencia if
        while (j < nombres.length) {
            System.out.println(nombres[j]);
            if (nombres[j].equals("Alonso")) {
                j+=2;
            }
            j++;
        }

        //Bucle while con array, sentencia if & boolean
        j = 0;
        boolean find = false;
        while(!find) {
            System.out.println(nombres[j]);
            if(nombres[j].equals("Alonso")) {
                find = true;
            }
            j++;
        }

        //Bucle do-while

        int k = 0;
        do {
            System.out.println("Hola, Java!");
            k++;
        } while (k < 5);

        System.out.println();

        int l = 0;
        do {
            System.out.println("Hola, Java!");
            l++;
        } while (l < 0);
    }
}
