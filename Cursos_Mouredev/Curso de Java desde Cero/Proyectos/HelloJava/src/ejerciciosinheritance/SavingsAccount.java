package ejerciciosinheritance;

public class SavingsAccount extends Account {

    private int interes;

    public void addInterest(int interes) {

        double porcentajeInteres;
        double saldoConInteres;

        if(interes < 1 || interes > 100) {
            System.out.println("El interés debe estar entre 1 y 100");
        } else {
            porcentajeInteres = interes / 100.0;
            saldoConInteres = (porcentajeInteres * getSaldo()) + getSaldo();
            System.out.println("Saldo total más el interés de: " + interes + " es: " + saldoConInteres);
            setSaldo(saldoConInteres);
        }
    }
}
