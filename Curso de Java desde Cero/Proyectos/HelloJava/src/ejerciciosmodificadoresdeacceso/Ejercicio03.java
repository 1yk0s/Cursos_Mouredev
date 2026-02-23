/*
03.- Crea una clase BankAccount con el atributo privado balance.
    Implementa los métodos deposit(double amount) y withdraw(double amount)
    que validen las cantidades correctamente.
    withdraw => Retirar.
    amount => cantidad.
    balance => cantidad total.
 */

package ejerciciosmodificadoresdeacceso;

public class Ejercicio03 {
    public static void main(String[] args) {

        BankAccount cuenta = new BankAccount("1yk0s", 15000);
        System.out.println("Titular de la cuenta: " + cuenta.getNameAccount());
        System.out.println("Saldo total de la cuenta " + cuenta.getBalance());
        cuenta.deposit(500);
        System.out.println("Saldo posterior a depósito: " + cuenta.getBalance());
        cuenta.withdraw(1500);
        System.out.println("Saldo posterior a retirada: " + cuenta.getBalance());
        cuenta.withdraw(16000); //Error, retira más de lo que existe
    }
}
/*
Solución por Mouredev:

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // mÃ©todos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.
        BankAccountExample account1 = new BankAccountExample("12345");
        account1.deposit(1000.0);
        account1.withdraw(300.0);
        account1.withdraw(800.0);
        account1.deposit(-50.0);

        // 3. Clase BankAccountExample
class BankAccountExample {
    private String accountNumber;
    private double balance;

    public BankAccountExample(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("DepÃ³sito de â‚¬" + amount + " realizado. Saldo actual: â‚¬" + balance);
        } else {
            System.out.println("El monto del depÃ³sito debe ser positivo");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("El monto del retiro debe ser positivo");
        } else if (amount > balance) {
            System.out.println("Fondos insuficientes. Saldo actual: â‚¬" + balance);
        } else {
            balance -= amount;
            System.out.println("Retiro de â‚¬" + amount + " realizado. Saldo actual: â‚¬" + balance);
        }
    }

}
 */