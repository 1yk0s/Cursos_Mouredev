package ejerciciospolimorfismo;

public class EjercicioOcho {
    public static void main(String[] args) {
        Converter conversor = new Converter();
        conversor.convertDouble("12.69");
        conversor.convertDoubleToInt(13.79);
        conversor.convertIntToDouble(17);
        conversor.convertInt("12345");
        conversor.convertStringDouble(19.4356);
        conversor.convertString(123456);
    }
}
/*
Solución por Mouredev:

     // 8. Crea una clase Converter con mÃ©todos convert(int), convert(double), y
     // convert(String) que devuelvan diferentes formatos de texto.
     Converter converter = new Converter();
     System.out.println(converter.convert(100));
     System.out.println(converter.convert(25.75));
     System.out.println(converter.convert("Java"));

    // 8. Clase Converter
    public static class Converter {
        public String convert(int number) {
            return "NÃºmero entero convertido: " + number + " -> '" + number + "'";
        }

        public String convert(double number) {
            return "NÃºmero decimal convertido: " + number + " -> '" + String.format("%.2f", number) + "'";
        }

        public String convert(String text) {
            return "Texto convertido: " + text + " -> '" + text.toUpperCase() + "'";
        }
    }


 */
