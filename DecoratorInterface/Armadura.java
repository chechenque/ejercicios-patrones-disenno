package DecoratorInterface;

public class Armadura implements Personaje{
    private Personaje personaje;

    public Armadura(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getAtaque() {
        return personaje.getAtaque();
    }

    public int getDefensa() {
        return personaje.getDefensa() + 10;
    }

    public int getVelocidad() {
        return personaje.getVelocidad() - 2;
    }

    public String getDescripcion() {
        return personaje.getDescripcion() + " + Armadura";
    }
}
