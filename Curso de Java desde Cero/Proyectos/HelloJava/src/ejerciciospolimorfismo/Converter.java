/*
5.- Crea una clase Vehicle con un método start().
    Luego crea, Car, Bike y Truck que sobrescriban ese método.
    Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
 */

package ejerciciospolimorfismo;

public class Converter {

    public Converter() {

    }

    public void convertStringDouble(double numero) {
        String cadenaNumero = Double.toString(numero);
        System.out.println(cadenaNumero);
    }

    public void convertIntToDouble(int numero) {
        double numeroDecimal = (double) numero;
        System.out.println(numeroDecimal);
    }

    public void convertDoubleToInt(double numero) {
        int numeroEntero = (int) numero;
        System.out.println(numeroEntero);
    }

    public void convertInt(String cadena) {
        Integer numeroCadena = Integer.parseInt(cadena);
        System.out.println(numeroCadena);
    }

    public void convertDouble (String numero) {
        Double numeroDouble = Double.parseDouble(numero);
        System.out.println(numeroDouble);
    }

    public void convertString (int numero) {
        String cadenaNumero = Integer.toString(numero);
        System.out.println(cadenaNumero);
    }
}
