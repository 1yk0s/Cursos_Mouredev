package ejerciciosclasesyobjetos;

public class BankAccount {

    String nombreCuenta;
    double balance;

    public BankAccount(String nombreCuenta, double balance) {
        this.nombreCuenta = nombreCuenta;
        this.balance = balance;
    }

    public void sumaSaldo(double saldo) {
        balance += saldo;
        System.out.println("El total actual es: " + balance);
    }
}
