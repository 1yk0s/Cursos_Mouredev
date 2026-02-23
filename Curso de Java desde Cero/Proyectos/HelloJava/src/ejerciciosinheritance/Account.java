package ejerciciosinheritance;

public class Account {
    private double saldo;

    public Account() {

    }

    public Account(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo: " + saldo);
    }

    public void deposit(double cantidad) {
        System.out.println("Has depositado: " + cantidad);
        saldo += cantidad;
        System.out.println("Saldo total: " + saldo);

    }

    public void withdraw(double cantidad) {
        if(saldo < cantidad) {
            System.out.println("No tienes saldo suficiente");
        } else {
            System.out.println("Has retirado: " + cantidad);
        }
        saldo -= cantidad;
        System.out.println("Saldo disponible: " + saldo);
    }
}
