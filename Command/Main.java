package Command;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Command encender = new EncenderLuzCommand(luz);

        ControlRemoto control = new ControlRemoto();
        control.setCommand(encender);
        control.presionarBoton();
    }
}
