/*
08.- Account tiene un saldo y métodos para deposit() y withdraw().
     SavingsAccount hereda y agrega un método addInterest().
     deposit => depositar
     withdraw => retirar.
     addInterest => Añadir interés
 */

package ejerciciosinheritance;

public class Ejercicio08 {
    public static void main(String[] args) {
        SavingsAccount cuenta = new SavingsAccount();
        cuenta.setSaldo(1200);
        cuenta.deposit(100);
        cuenta.withdraw(100);
        cuenta.addInterest(30);
    }

}
/*
Solución por Mouredev:

        // 8. Account tiene un saldo y mÃ©todos para deposit() y withdraw().
        // SavingsAccount hereda y agrega un mÃ©todo addInterest().
        Account account = new Account(1000.0);
        account.deposit(200.0);
        account.withdraw(150.0);
        System.out.println("Saldo de cuenta: $" + account.balance);

        SavingsAccount savingsAccount = new SavingsAccount(2000.0);
        savingsAccount.deposit(300.0);
        savingsAccount.addInterest();
        System.out.println("Saldo de cuenta de ahorros: $" + savingsAccount.balance);

            // 8. Clases Account y SavingsAccount
    public static class Account {
        protected double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("DepÃ³sito de $" + amount + ". Nuevo saldo: $" + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro de $" + amount + ". Nuevo saldo: $" + balance);
            } else {
                System.out.println("Fondos insuficientes");
            }
        }
    }

    public static class SavingsAccount extends Account {
        public SavingsAccount(double balance) {
            super(balance);
        }

        public void addInterest() {
            double interest = balance * 0.05;
            balance += interest;
            System.out.println("InterÃ©s agregado: $" + interest + ". Nuevo saldo: $" + balance);
        }
    }
 */