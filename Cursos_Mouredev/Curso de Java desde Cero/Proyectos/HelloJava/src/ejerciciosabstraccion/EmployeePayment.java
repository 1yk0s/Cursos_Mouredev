package ejerciciosabstraccion;

public class EmployeePayment extends Payable implements Payable.Pay {
    @Override
    public void pay() {
        System.out.println("Pago de los empleados");
    }
}
