package ejerciciosmodificadoresdeacceso;

public class BankAccount {

    private String nameAccount;
    private double balance;

    public BankAccount (String nameAccount, double balance) {
        this.nameAccount = nameAccount;
        this.balance = balance;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        double resultado = 0;
        if(amount > 0) {
            resultado = (balance + amount);
            balance = resultado;
            System.out.println("Balance actual: " + balance);
        } else {
            System.out.println("No puedes depositar una cantidad inferior a 0");
        }
        return resultado;
    }

    public double withdraw(double amount) {
        double resultado = 0;
        if(amount < balance) {
            resultado = balance - amount;
            System.out.println("El saldo restante es de: " + resultado);
        } else {
            System.out.println("No puedes retirar una cantidad que no tienes");
        }
        return resultado;
    }
}
