package DecoratorInterface;

public class Espada implements Personaje{
    private Personaje personaje;

    public Espada(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getAtaque() {
        return personaje.getAtaque() + 15;
    }

    public int getDefensa() {
        return personaje.getDefensa();
    }

    public int getVelocidad() {
        return personaje.getVelocidad();
    }

    public String getDescripcion() {
        return personaje.getDescripcion() + " + Espada";
    }
}
