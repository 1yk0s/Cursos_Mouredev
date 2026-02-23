package operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {

        //Operadores Unarios

        int b = 3;

        System.out.println(+b);     //Valor positivo
        System.out.println(-b);     //Valor negativo
        System.out.println(++b);    //Se incrementa el valor y se imprime por pantalla
        System.out.println(b++);    //Se imprime por pantalla y se incrementa el valor
        System.out.println(b);      //El valor se ha incrementado posterior a la impresión por pantalla.

        System.out.println(--b); //Decrementa el valor y lo imprime por pantalla
        System.out.println(b--); //Imprime el valor y después lo decrementa
        System.out.println(b); //El valor ha sido decrementado


    }
}
