package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Operadores
        //Aritméticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(a % b);

        //Operadores de asignación
        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        //Operadores de asignación directa

        a += 1;     // a = a + 1;
        System.out.println(a);

        a -= 1;     // a = a - 1;
        System.out.println(a);

        a *= 1;     // a = a * 1;
        System.out.println(a);

        a /= 1;     // a = a / 1;
        System.out.println(a);

        a %= 1;     // a = a % 1;
        System.out.println(a);

    }
}
