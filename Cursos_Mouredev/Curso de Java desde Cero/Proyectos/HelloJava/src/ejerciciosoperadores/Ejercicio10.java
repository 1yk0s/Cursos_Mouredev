/*
Combina operadores aritméticos, de comparación y lógicos.
 */

package ejerciciosoperadores;

public class Ejercicio10 {

    public static void main(String[] args) {
        //Variables
        int a = 5;
        int b = 10;
        boolean logico = true;

        System.out.println("¿Es la variable \"a\" menor que la variable \"b\" ?" +
                " o es el valor contrario a la variable \"logico\" ?");
        System.out.println((a < b && 5 < 10) || !logico);

    }
}

/*
Ejemplo de Mouredev:

        System.out.println("\n=== COMBINANDO DIFERENTES OPERADORES ===");
        int price = 100;
        int discount = 15;
        boolean isVipClient = true;
        boolean isPurchaseOver50 = true;

        int discountedPrice = price - (price * discount / 100);
        boolean appliesExtraDiscount = isVipClient && isPurchaseOver50;
        int extraDiscount = appliesExtraDiscount ? 10 : 0;
        int finalPrice = discountedPrice - extraDiscount;

        System.out.println("Precio original: $" + price);
        System.out.println("Descuento: " + discount + "%");
        System.out.println("Es cliente VIP: " + isVipClient);
        System.out.println("Compra mayor a $50: " + isPurchaseOver50);
        System.out.println("Precio con descuento: $" + discountedPrice);
        System.out.println("Â¿Aplica descuento extra? " + appliesExtraDiscount);
        System.out.println("Precio final: $" + finalPrice);

        // Ejemplo complejo con mÃºltiples operadores
        int a1 = 10, b1 = 5, c1 = 3;
        boolean complexResult = (a1 + b1) > c1 * 4 && !(a1 % 2 == 0 && b1 < 10) || c1 != 3;
        System.out.println("\nOperaciÃ³n compleja:");
        System.out.println("a1=" + a1 + ", b1=" + b1 + ", c1=" + c1);
        System.out.println("(a1 + b1) > c1 * 4 && !(a1 % 2 == 0 && b1 < 10) || c1 != 3");
        System.out.println("Resultado: " + complexResult);
 */
