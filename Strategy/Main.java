package Strategy;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        carrito.setEstrategia(new PagoTarjeta());
        carrito.pagar(100);

        carrito.setEstrategia(new PagoPayPal());
        carrito.pagar(200);
    }
}
