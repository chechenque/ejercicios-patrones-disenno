public class Display implements Observer{
    public void update(float temperatura) {
        System.out.println("Temperatura actual: " + temperatura);
    }
}
