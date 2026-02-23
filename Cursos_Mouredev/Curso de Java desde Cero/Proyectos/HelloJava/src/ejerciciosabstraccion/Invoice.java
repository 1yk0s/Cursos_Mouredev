package ejerciciosabstraccion;

public class Invoice extends Payable implements Payable.Pay {
    @Override
    public void pay() {
        System.out.println("Pago de factura");
    }
}
