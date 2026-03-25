package DecoratorInterface;

public class Botas implements Personaje{
    private Personaje personaje;

    public Botas(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getAtaque() {
        return personaje.getAtaque();
    }

    public int getDefensa() {
        return personaje.getDefensa();
    }

    public int getVelocidad() {
        return personaje.getVelocidad() + 5;
    }

    public String getDescripcion() {
        return personaje.getDescripcion() + " + Botas";
    }
}
