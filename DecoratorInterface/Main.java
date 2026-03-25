package DecoratorInterface;

public class Main {
    public static void main(String[] args) {

        Personaje personaje = new PersonajeBase();

        personaje = new Armadura(personaje);
        personaje = new Botas(personaje);
        personaje = new Espada(personaje);

        System.out.println(personaje.getDescripcion());
        System.out.println("Ataque: " + personaje.getAtaque());
        System.out.println("Defensa: " + personaje.getDefensa());
        System.out.println("Velocidad: " + personaje.getVelocidad());
    }
}
