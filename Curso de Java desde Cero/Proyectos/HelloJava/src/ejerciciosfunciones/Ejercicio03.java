/*
03.- Haz un método que reciba dos números enteros y devuelva su resta.
 */

package ejerciciosfunciones;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;
        System.out.println(operacionResta(numero1, numero2));
    }

    public static int operacionResta(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        System.out.println("La resta de " + num1 + " menos " + num2 + " es: ");
        return resta;
    }
}

/*
Solución por Mouredev:
        // 3. Haz un mÃ©todo que reciba dos nÃºmeros enteros y devuelva su resta.
        int result = subtractNumbers(10, 3);
        System.out.println("Resultado de la resta: " + result);
        System.out.println("15 - 8 = " + subtractNumbers(15, 8));

            // 3. FunciÃ³n que recibe dos enteros y retorna su resta
        public static int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
 */