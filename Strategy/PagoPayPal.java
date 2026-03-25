package Strategy;

public class PagoPayPal implements PagoStrategy{
    public void pagar(int cantidad) {
        System.out.println("Pagando con PayPal: " + cantidad);
    }
}
