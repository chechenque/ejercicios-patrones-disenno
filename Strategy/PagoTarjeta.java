package Strategy;

public class PagoTarjeta implements PagoStrategy{
    public void pagar(int cantidad) {
        System.out.println("Pagando con tarjeta: " + cantidad);
    }
}
