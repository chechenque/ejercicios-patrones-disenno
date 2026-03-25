package Decorator;

public class Leche extends CafeDecorator {
    public Leche(Cafe cafe) {
        super(cafe);
    }

    public String descripcion() {
        return cafe.descripcion() + " con leche";
    }

    public double costo() {
        return cafe.costo() + 5;
    }
}
