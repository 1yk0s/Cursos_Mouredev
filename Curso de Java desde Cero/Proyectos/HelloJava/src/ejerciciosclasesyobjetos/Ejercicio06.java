/*
06.- Crea una clase BankAccount con atributo balance y un método deposit()
    que sume el saldo.
 */

package ejerciciosclasesyobjetos;

public class Ejercicio06 {
    public static void main(String[] args) {

        BankAccount cuentaUno = new BankAccount("Kevin", 700);
        cuentaUno.sumaSaldo(300);

    }
}
/*
Solución por Mouredev:

        // 6. Crea una clase BankAccount con atributo balance y un mÃ©todo deposit() que
        // sume el saldo.
        BankAccount account1 = new BankAccount("12345", 1000.0);
        account1.showBalance();
        account1.deposit(250.0);
        account1.showBalance();

        // 6. Clase BankAccount
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("DepÃ³sito realizado: â‚¬" + amount);
        } else {
            System.out.println("El monto del depÃ³sito debe ser positivo");
        }
    }

    public void showBalance() {
        System.out.println("Saldo de la cuenta " + accountNumber + ": â‚¬" + balance);
    }
}
 */
