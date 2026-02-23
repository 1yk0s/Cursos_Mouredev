/*
10.- Crea una interfaz Payable con méyodo pay().
    Luego implementa las clases Invoice (factura) y EmployeePayment, cada una mostrando un mensaje
    de pago diferente.
 */

package ejerciciosabstraccion;

public class Ejercicio10 {
    public static void main(String[] args) {
        Invoice factura = new Invoice();
        EmployeePayment pagoFacturaEmpleado = new EmployeePayment();
        factura.pay();
        pagoFacturaEmpleado.pay();
    }
}
/*
Solución por Mouredev:

        // 10. Crea una interfaz Payable con el mÃ©todo pay(). Luego implementa las
        // clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
        // diferente.
        Payable invoice = new Invoice(500.0);
        Payable employeePayment = new EmployeePayment("Brais", 2500.0);
        invoice.pay();
        employeePayment.pay();

            // 10. Interfaz Payable y clases Invoice y EmployeePayment
    public interface Payable {
        void pay();
    }

    public static class Invoice implements Payable {
        private double amount;

        public Invoice(double amount) {
            this.amount = amount;
        }

        @Override
        public void pay() {
            System.out.println("Pagando factura por â‚¬" + amount);
        }
    }

    public static class EmployeePayment implements Payable {
        private String employeeName;
        private double salary;

        public EmployeePayment(String employeeName, double salary) {
            this.employeeName = employeeName;
            this.salary = salary;
        }

        @Override
        public void pay() {
            System.out.println("Pagando salario de â‚¬" + salary + " a " + employeeName);
        }
 */