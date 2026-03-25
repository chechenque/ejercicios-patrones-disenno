package Strategy;

public class Carrito {
    private PagoStrategy estrategia;

    public void setEstrategia(PagoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void pagar(int cantidad) {
        estrategia.pagar(cantidad);
    }
}
