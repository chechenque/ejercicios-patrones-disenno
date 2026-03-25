package Decorator;

public class CafeSimple implements Cafe{
    public String descripcion() {
        return "Café";
    }

    public double costo() {
        return 20;
    }
}
