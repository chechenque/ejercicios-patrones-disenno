package DecoratorInterface;

public class PersonajeBase implements Personaje {
    public int getAtaque() { return 10; }
    public int getDefensa() { return 5; }
    public int getVelocidad() { return 7; }

    public String getDescripcion() {
        return "Persona base";
    }
}
