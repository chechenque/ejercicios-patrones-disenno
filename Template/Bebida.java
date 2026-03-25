package Template;

public abstract class Bebida {
    public final void preparar() {
        hervirAgua();
        agregarIngrediente();
        servir();
    }

    abstract void agregarIngrediente();

    void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    void servir() {
        System.out.println("Sirviendo en taza");
    }
}
